def print_hollow_rectangle(gridSize:int)-> None:
    for row in range(1,gridSize+1):
        chars=[]
        for column in range(1,gridSize+1):           
            isStar=row==1 or column==gridSize or row==gridSize or column==1 
            chars.append("*") if isStar else chars.append(" ")
        print(" ".join(chars))


def print_diagonals_and_edges(gridSize: int) -> None:
     for row in range(1,gridSize+1):
        chars=[]
        for column in range(1,gridSize+1):     
            isdiagonal= row == column or row+column==gridSize+1      
            isStar=row==1 or column==gridSize or row==gridSize or column==1 
            chars.append("*") if isStar or isdiagonal else chars.append(" ") 
        print(" ".join(chars))


def print_left_aligned_triangle(row_max:int)->None:
    for row in range(row_max+1):
        line="".join('*' for column in range(1,row+1))
        print(line)


def print_right_aligned_triangle(row_max:int)->None:
    for row in range(1,row_max):
        space_count = row_max - row
        star_count = row
        line = ''.join(' ' for _ in range(1, space_count + 1)) +''.join('*' for _ in range(1, star_count + 1))
        print(line)


def print_centered_pyramid(row_max:int)->None:
    for row in range(1,row_max+1):
        spcesCount=row_max-row
        starsCount=(2*row)-1
        line=''.join(" " for i in range(spcesCount)) + ''.join("*" for i in range(starsCount))
        print(line)


def print_inverted_centered_pyramid(row_max:int)->None:
    for row in range(1,row_max+1):
        spaceCount=row-1
        starsCount=2*(row_max-row)+1
        line=''.join(" " for i in range(spaceCount))+''.join("*" for i in range(starsCount))
        print(line)


def printDiamond(row_max:int)->None:
    for row in range(1,row_max+1):
        spaceCount=row_max-row if row<=(row_max//2)+1 else row-1
        starsCount=(2*row)-1 if row<=(row_max//2)+1 else 2*(row_max-row)+1
        line=''.join(" " for i in range(spaceCount))+''.join("*" for i in range(starsCount))
        print(line)

def print_hollow_pyramid(row_max:int)->None:
    for row in range(1,row_max+1):
        spcesCount=row_max-row
         
        for i in range(1,spcesCount+1):
            print(" ",end="")
        for j in range(1,(2*row)):
            if j==1 or j==2*row-1 or row==row_max:
                print("*",end="")
            else:
                print(" ",end="")
           
        # line=''.join(" " for i in range(spcesCount)) + ''.join("*" for i in range(starsCount))
        # print(line)
        print()

# print_hollow_rectangle(8)
# print_diagonals_and_edges(9)
# print_left_aligned_triangle(5)
# print_right_aligned_triangle(6)
# print_centered_pyramid(5)
# print_inverted_centered_pyramid(4)
# printDiamond(5)
print_hollow_pyramid(5)
