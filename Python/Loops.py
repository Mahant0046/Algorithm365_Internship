# Right Angle Triangle Pattern with Asterisks
def printTriangleNumbers(num):
    for i in range(1,num+1):
        for j in range(1,i+1):
            print(j,end=" ")
        print("")

def printTriangleStars(num):
    for i in range(1,num+1):
       print(i*"*")

printTriangleNumbers(4)
printTriangleStars(5)