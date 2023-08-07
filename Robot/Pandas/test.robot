*** Settings ***
Library           Process
Library           palavra.py

*** Test Cases ***
Obter Palavra e Armazenar em Variável
    ${retorno}    palavra.obter_palavra    
    Log To Console    ${retorno}