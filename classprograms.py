import array as abc
def reverselist(a,s,e):
    while (s<e):
        e=e-1
    a[s],a[e]=a[e],a[s]
a=[21,23,23,455,64,53,67,3,2,68,3,67,]
ar=abc.array
reverselist(a,0,10)
print(ar)