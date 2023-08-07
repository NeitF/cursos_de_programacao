import pandas as pd

path = r"C:\Users\nafs2\Documents\Git\cursos_de_programacao\Robot\Pandas\arquivo.xlsx"
path2 = r"C:\Users\nafs2\Documents\Git\cursos_de_programacao\Robot\Pandas\arquivoCopia.xlsx"

df = pd.read_excel(path)
dfCopia = pd.read_excel(path2)



# coluna = df['Department']
# coluna2 = dfCopia['Department']

# qtdLinhas = df.shape[0]
# print(qtdLinhas)
# print(coluna)

for l in range(df.shape[0]):
    
    coluna = df.at[l, 'Department']
    coluna2 = dfCopia.at[l, 'Department']

    if coluna == coluna2:
        # print('Iguais')
        pass
    else:
        print('Erro')