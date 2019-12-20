:- ensure_loaded('game.pl').
:- ensure_loaded('agents.pl').
:- ensure_loaded('knowledge.pl').

right_of(stone(_, RightNumber), stone(_, LeftNumber)) :-
							LeftNumber < RightNumber.
right_of(stone(white, Number), stone(_, Number)).

can_sequence(_, []).
can_sequence(stone(Colour, Number), [H|T]) :-
							last([H|T], Last),
							right_of(stone(Colour, Number), Last).

valid_sequence([]).
valid_sequence([_]).
valid_sequence([Item,Next|Rest]) :- right_of(Next, Item), valid_sequence([Next|Rest]).

possible(ReqAgent, Agent, Position, TillNow, stone(Colour, Number)) :-
							% Generate the number, and
							code(Number),
							(
								% Knows that at this location is a certain stone
								knows(ReqAgent, is_stone(Agent, Position, Colour, Number))
								
								% or
								;
								(
									not(knows(ReqAgent, is_stone(Agent, Position, _, _))),
									
									% Not in the list yet, and
									not(listfind(TillNow, stone(Colour, Number))),
									
									% Not knows that the stone cannot be at that location, and
									not(knows(ReqAgent, not(is_stone(Agent, Position, Colour, Number)))),
									
									% The stone doesn't invalidate the sequence
									can_sequence(stone(Colour, Number), TillNow)
								)
							).

% Stop when no more stones
sequence_(_, _, _, [], [], _).

% Determine sequence
sequence_(RequestingAgent, Agent, TillNow, [stone(Colour, Number)|Sequence], [stone(Colour, _, _)|Stones], Position) :-
							possible(RequestingAgent, Agent, Position, TillNow, stone(Colour, Number)),
							Next is Position + 1,
							append(TillNow, [stone(Colour, Number)], NewTillNow),
							sequence_(RequestingAgent, Agent, NewTillNow, Sequence, Stones, Next).

sequence(RequestingAgent, Agent, Sequence) :-
							stones(Agent, Stones),
							sequence_(RequestingAgent, Agent, [], Sequence, Stones, 0),
							valid_sequence(Sequence).
