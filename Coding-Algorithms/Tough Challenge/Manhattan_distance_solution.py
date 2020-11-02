#!/usr/bin/env python
# coding: utf-8

# In[9]:


def manhattanDistance(li1,li2):
    x1 = int(li1[0])
    x2 = int(li2[0])
    y1 = int(li1[1])
    y2 = int(li2[1])
    return (abs(x1-x2)+abs(y1-y2))

print("Manhattan Distance of two points A and B")
li1 = input("Enter the coordinates of A: ").split()
li2 = input("Enter the coordinates of B: ").split()

manhattanDistance(li1,li2)

