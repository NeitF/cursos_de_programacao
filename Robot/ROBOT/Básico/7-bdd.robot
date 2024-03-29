*** Settings ***
Library    SeleniumLibrary

*** Variables ***
#Dados do teste
${NomeDaMusica}    Ariana Grande Positions

#Variáveis de configuração
${URL}    https://www.youtube.com
${Browser}    chrome

#Elementos
${Input_Pesquisa}    //input[@id="search"]
${Button_pesquisa}   //button[@id="search-icon-legacy"]
${Primeiro}          (//yt-formatted-string[@class="style-scope ytd-video-renderer"])[1]
${Prova}             //div[contains(text(), "Ordenar por")]

*** Keywords ***
Dado que eu acesso o site do youtube
    Open Browser                     ${URL}    ${Browser}
Quando digito o nome da música
    Input Text                       ${Input_Pesquisa}   ${NomeDaMusica}
E clico no botão buscar
    Click Element                    ${Button_pesquisa}
E clico na primeira opção da lista
    Wait Until Element Is Visible    ${Primeiro}    5
    Click Element                    ${Primeiro}
Então o vídeo é executado
    Wait Until Element Is Visible    ${Prova}    10
    Element Should Be Visible        ${Prova}
    Sleep    1s
    Close Browser

*** Test Cases ***
Cenario 1: Executar video no youtube
     Dado que eu acesso o site do youtube
     Quando digito o nome da música
     E clico no botão buscar
     E clico na primeira opção da lista
     Então o vídeo é executado