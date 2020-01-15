:- ensure_loaded('agents.pl').
:- ensure_loaded('utils.pl').
:- ensure_loaded('solve.pl').
:- ensure_loaded('knowledge.pl').
:- ensure_loaded('code.pl').

:- dynamic stones/2.
¾Æ·±¤±¤·
¤·1312
¤·¶ótxt.

make_stones_real(Num) :- assert(stones(Num, [])).

make_stones(0).
make_stones(Num) :- Num > 0,
					NextNum is Num - 1,
					make_stones_real(NextNum),
					make_stones(NextNum).

new_agents(Num) :- 	retractall(stones(_, _)), 
					make_stones(Num).


% No stones left, Position is 0
stone_position_([], _, 0).

% NumberMatch is smaller than Number, so Position is 0
stone_position_([stone(_, Number, _)|_], NumberMatch, 0) :-
					NumberMatch < Number.

% NumberMatch is greater than Number, so Position is increased
stone_position_([stone(_, Number, _)|Tail], NumberMatch, Position) :-
					NumberMatch > Number,
					stone_position_(Tail, NumberMatch, NewPosition),
					Position is NewPosition + 1.

% NumberMatch equals Number and Colour is black, so Position is 1
stone_position_([stone(Colour, Number, _)|_], Number, 1) :-
					Colour = black.
% NumberMatch equals Number and Colour is white, so Position is 0
stone_position_([stone(Colour, Number, _)|_], Number, 0) :-
					Colour = white.

% Get position of a stone when inserted in an agents stones list
stone_position(Agent, stone(_, Number, _), Position) :-
					stones(Agent, Stones),
					stone_position_(Stones, Number, Position).

% Has stone
has_stone_([Stone], Stone).
has_stone_([Stone|_], Stone).
has_stone_([_|Tail], Stone) :- has_stone_(Tail, Stone).
					
has_stone(Agent, stone(Colour, Number, State)) :-
					stones(Agent, Stones),
					has_stone_(Stones, stone(Colour, Number, State)).
			
% Add a stone to the agents stones list
add_stone(Agent, stone(Colour, Number, State)) :-
					stone_position(Agent, stone(Colour, Number, State), Position),
					stones(Agent, Stones),
					insert(stone(Colour, Number, State), Position, Stones, NewStones),
					retract(stones(Agent, _)),
					assert(stones(Agent, NewStones)),
					write(NewStones).

set_stone_open(Agent, Position) :-
					stones(Agent, Stones),
					nth0(Position, Stones, stone(Colour, Number, State)),
					replace(stone(Colour, Number, State), stone(Colour, Number, open), Stones, NewStones),
					retract(stones(Agent, _)),
					assert(stones(Agent, NewStones)).
