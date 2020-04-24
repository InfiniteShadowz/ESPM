#Python3

'''
Por favor, usar esse conversor de maneira didática preferencialmente!! Estude o código.
'''


bits = int(input("Digite o numero de bits que deseja converter para Bytes: "))
MB = 0
KB = 0
B = 0

#Converte os bits para Bytes:
B = bits / 8

MB = B // 1024**2 #faz a divisão inteira dos Bytes e armazena nos KB
B = B % 1024**2 #pega o resto do MB e armazena no Byte

KB = B //1024 #faz a divisão inteira dos Bytes e armazena nos KB
B = B %1024 #pega o resto do KB e armazena no Byte

print(" {}MB {}KB {}B. ". format(MB, KB, B))

