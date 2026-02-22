def printNumbersUpto100(rows):
    if rows>0:
        for row in range(1,rows+1):
            for i in range(row,101):
                print(i,end=" ")
            print("--------------------------------------------------")
    else:
        print("Number should be not Negitive")

def printNumbers(rows):
    if rows>0:
        for row in range(1,rows+1):
           for i in range(1,10+1):
               print(row*i,end=" ")
           print(" ")
        

        

# printNumbersUpto100(2)
printNumbers(10)
