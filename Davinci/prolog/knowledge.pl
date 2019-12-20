:- ensure_loaded('agents.pl').
:- ensure_loaded('game.pl').

:- dynamic knows/2.
:- multifile knows/2.

stone_is_open_r([Agent], stone(Colour, Number)) :-
						has_stone(Agent, stone(Colour, Number, open)).

stone_is_open_r([Agent|Rest], stone(Colour, Number)) :-
						has_stone(Agent, stone(Colour, Number, open))
						;
						stone_is_open_r(Rest, stone(Colour, Number)).

stone_is_open(stone(Colour, Number)) :-
	findall(AllAgents, agent(AllAgents, _), Agents),
	stone_is_open_r(Agents, stone(Colour, Number)).

% Agent knows a stone, when the stone is open
knows(_, is_stone(TargetAgent, Position, Colour, Number)) :-
						stones(TargetAgent, Stones),
						nth0(Position, Stones, stone(Colour, Number, open)).

% Agent knows that something cannot be a stone if the stone is open somewhere,
% or the agent has the stone himself
knows(Agent, not(is_stone(TargetAgent, Location, Colour, Number))) :-
						not(knows(Agent, is_stone(TargetAgent, Location, _, _))),
						(
							% Agent has stone himself, or
							has_stone(Agent, stone(Colour, Number, _))
							;
							% Open anywhere
							stone_is_open(stone(Colour, Number))
						).
							
