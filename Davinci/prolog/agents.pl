:- dynamic num_agents/1.
:- dynamic agent/1.
:- dynamic new_agents/1.
:- multifile new_agents/1.

% Making agent facts
make_agents(Max, Max).
make_agents(Current, Max) :- Current < Max,
						assert(agent(Current, [])), 
						Next is Current + 1, 
						make_agents(Next, Max).

new_agents(_).
						
% Setting number of agents
set_agents(Num) :- retractall(agent(_, _)), 
						retractall(num_agents(_)),
						assert(num_agents(Num)), 
						make_agents(0, Num),
						findall(_, new_agents(Num), _).

% Default number of agents is 0
:- set_agents(0).
