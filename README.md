Input:
n m
id0 score0
id1 score1
...
idn scoren
1. a group of people submiting their score
2. total number of inputs n
3. number of people with higest score m.
4. (each person can submit more than once, and scores will accumulate)

Output:
m ids separated by a space.
first m people's id ranking from highest to lower score.

Example:
We want the best 1 person with highest score. There are in total 3 submits. Alex(id = 0) submits 2 times with score 1 and 2. Bob(id = 1) submits 1 time with score 1.
    Input:
    3 1
    0 1
    0 2
    1 1
    Output:
    0