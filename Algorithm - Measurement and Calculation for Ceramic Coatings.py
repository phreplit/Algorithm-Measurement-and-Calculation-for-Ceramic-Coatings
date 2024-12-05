
''' Author: PHNO - Technologist | Postgraduate
    Release Date: 29/11/2024
    Version: 0.0.0.2v
    Replit: @PHNO, @PHREPLIT
    E-mail: phreplit@gmail.com  '''

''' Algorithm: Measurement and Calculation for Ceramic Coatings, algorithm built in python, built for professionals in civil engineering and related areas. '''

import os # import lib - os clear
import sys
import json

def reset_text():
    os.system('cls' if os.name=='nt' else 'clear')

op = 0 
while op != -1:
  print('')
  print(' Measurement and Calculation for Ceramic Coatings ')
  print('')
  print('')
  print('1. Calculate Square Meter of a Room')
  print('2. Calculate Quantity of Ceramics per M²')
  print('3. Calculate Quantity of Ceramic Boxes per M²')
  print('4. Exit')
  print('[8] Info')
  print('[9] About')
  print('')
  op = int(input('Enter with your choice: '))
  if op == 1:
   print('')
   v1 = int(input('Enter the length of the room: '))
   print('')
   v2 = int(input('Enter the room width: '))
   result = v1 * v2
   print('')
   print('The room has: {} square meters.'.format(result))
   print('')
   print('Press enter to return to the menu...')
   a1 = str(input(''))
   reset_text()
  elif op == 2:
   v4 = int(4)
   print('')
   v3 = int(input('Enter how many square meters the roof has: '))
   print('')
   result2 = v3 * v4
   print('')
   print('To lay {} M² of a room, {} ceramic will be required.'.format(v3,result2))
   print('')
   print('Press enter to return to the menu...')
   a2 = str(input(''))
   reset_text() # clear screen - lib os
  elif op == 3:
   cx1 = int(8)  
   v6 = int(4)
   print('')
   v5 = int(input('Enter how many square meters the roof has: '))
   print('')
   resultado = v5 * v6
   calcqtdcaixa = resultado / cx1
   print('')
   print('To lay {} m² of a room, {} ceramic boxes will be required.'.format(v5,calcqtdcaixa))
   print('')
   print('Press enter to return to the menu...')
   a2 = str(input(''))
   reset_text() # clear screen - lib os
  elif op == 4:
   print('')
   print('Finished Algorithm!')
   print('')
   break
  elif op == 8:
   reset_text()
   print('')
   print('Info')
   print('')
   print('To Calculate the Square Meter of a Room:')
   print('We calculate the length x width, see as an example a room with (3.70 meters long x 2.70 meters wide) we have that L x W = 10M².')
   print('To Calculate Ceramic Coatings:')
   print('Taking a 50cm x 50cm ceramic tile as an example, we have that 2 x 2 ceramic tiles = 4 ceramic tiles, which is equivalent to 1M². This will be the standard calculation: 4 ceramic tiles = 1M². Therefore, any (N) square meters x 4 = the quantity (N) of tiles per square meter.')
   print('To Calculate Quantity of Ceramic Boxes: ')
   print('Knowing that each box has 8 ceramic tiles, then for each 1 box of ceramic tiles we have 2m², and then Any (N) square meters x 4 (one m²) = (N) quantity of ceramic tiles and this result divided by a box (8) = the (N) quantity of ceramic boxes to lay a room.')
   print('')
   print('Important information: ')
   print('')
   print('This algorithm was built with integer variables so it does not accept numbers with commas e.g.: 2.90 meters change to 3 meters.')
   print('This algorithm was built in Python 3 and by default always requires that its syntax and indentation are always correct for its correct compilation in the console.')
   print('')
   print('Press enter to return to the menu...')
   a5 = str(input(''))
   reset_text()
  elif op == 9:
   reset_text()
   print('')
   print('Algorithm: Measurement and Calculation for Ceramic Coatings')
   print('')
   print('Author: PHNO')
   print('Release Date: 29/11/2024')
   print('Version: 0.0.0.2v')
   print('Replit: @PHNO, @PHREPLIT')
   print('E-mail: phreplit@gmail.com')
   print('')
   print('Press enter to return to the menu...')
   a5 = str(input(''))
   reset_text()
  else: 
   print('')
   print('Error. Wrong Choice!')
   print('')
   print('Press enter to return to the menu...')
   a6 = str(input(''))
   reset_text()