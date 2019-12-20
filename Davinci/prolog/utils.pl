% Insert the item
insert(Item, 0, List, [Item|List]).

% Insert item at end if list is empty
insert(Item, _, [], [Item]).

% Insert item at beginning for index < 0
insert(Item, Idx, List, [Item|List]) :- Idx < 0.

insert(Item, Idx, [H|T], [H|Res]) :- Idx > 0, 
						Next is Idx - 1,
						insert(Item, Next, T, Res).

listfind([Item|_], Item).
listfind([_|Rest], Item) :- listfind(Rest, Item).

replace(_, _, [], []).
replace(Item, New, [Item|Rest], [New|NewRest]) :- 
						replace(Item, New, Rest, NewRest).
replace(Item, New, [First|Rest], [First|NewRest]) :- 
						First \= Item,
						replace(Item, New, Rest, NewRest).
