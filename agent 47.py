"""square = [x**2 for x in range(10)]
print(square)

matrix = [[1,2,3],[4,5,6],[7,8,9]]
flat_list=[num for row in matrix for num in row]
print(flat_list)

add = lambda x, y:x+y
print(add(5,3))

square = [x**2 for x in range(10) if x%2==0]
print(square)

number=[1,2,3,4,5]
square = list(filter(lambda x: x**2,number))
print(square)

number = {1,2,3,4,5}
even_number = list(filter(lambda x: x%2 == 0,number))
print(even_number)
"""
'''
import numpy as np
arr1 = np.array([[1,2],[3,4]])
arr2 = np.array([[1,2],[3,4]])
dot_product = np.dot(arr1,arr2)
print(dot_product)
element_wise_mul =arr1 * arr2
print(element_wise_mul)'''

import pandas as pd
data =[1,2,3,4,5]
series = pd.Series(data)