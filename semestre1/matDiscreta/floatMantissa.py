#Python3

decimal = float(input("digite o decimal float para transformar para binario (lembre-se de usar . e não ,): "))

#max 1024 e min 2^-18
res = 1024.0
binario = []
headers = []
start = False
count = 0
ten = 10

binarioFinal = []

if decimal < 0:
    signedDecimal = 1
    decimal *= -1
else:
    signedDecimal = 0

#firstADD
binarioFinal.append(signedDecimal)

numSignedExp = 0

###############################################

for exp in range(10, -19, -1):

    #if exp % 2 == 0:
       #print('Expoente {} => {}'.format(exp, res),end = ' ')
    #else:
       #print("Expoente {} => {}".format(exp, res),end = ' ')
        
  if decimal - res > 0:
    #print("[1]")
    #print(40 * "=")
    decimal -= res
    start = True
    if start:
      headers.append(exp)
      binario.append(1)
      count +=1
      if start and count == 1:
        numSignedExp = exp
  else:
    #print("0")
    if start:
      headers.append(exp)
      binario.append(0)
      count +=1
   
  res /= 2


###############################################

signedExp = 0

if numSignedExp < 0:
  signedExp = 1
  numSignedExp *= -1
  
binarioFinal.append(signedExp)

for i in range(3, -1, -1):
  aux = numSignedExp
  numSignedExp = numSignedExp - 2**i
  if numSignedExp < 0:
    binarioFinal.append(0)
    numSignedExp = aux
  else:
    binarioFinal.append(1)
    
    
# 1.6666666666 = 0000.0010.1010.1010 
# -0.0735 = 1101.0000.1011.0100 
# -240.25 = 1001.1111.1000.0010 
# 45.1875 = 0001.0101.1010.0110 


for i in range(0, count):
  numBin = binario[i]
  expoente = headers[i]
  print("Expoente --> {} || {}".format(expoente, numBin))

#esconde o primeiro digito 1 (natural da mantissa, pois trata-se de uma redundância)
del binario[0]

for i in range(0, 10):
  binarioFinal.append(binario[i])


print("Resultado Final:\n")
print(binarioFinal)

#descomente essa linha para usar o programa no cmd:
#input()

