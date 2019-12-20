:- dynamic code/1.

code_range(0, 11).
generate_codes(Max, Max) :-
							assert(code(Max)).
generate_codes(Min, Max) :-
							Min < Max,
							assert(code(Min)),
							Next is Min + 1,
							generate_codes(Next, Max).

:- code_range(Min, Max), generate_codes(Min, Max).
