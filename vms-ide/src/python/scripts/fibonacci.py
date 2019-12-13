parents, babies = (1, 1)
while babies < 10000:
    print ('This generation has {0} babies'.format(babies))
    parents, babies = (babies, parents + babies)
