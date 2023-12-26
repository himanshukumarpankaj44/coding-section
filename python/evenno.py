number=[1,2,3,4,5,6,7,10]
rev=[]
#print("evn numbers", [num for num in number if num%2==0])
for i in range(len(number),0,-1):
    x=number[i]
    rev.append(x)
print(rev)