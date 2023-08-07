*** Settings ***
Library    SeleniumLibrary
Resource    ../5-checkboxRadio.robot

*** Variables ***
#VARIÁVEIS DE INPUTS
${input_name}              //input[@id="name"]
${input_phone}            //input[@id="phone"]
${input_email}           //input[@id="email"]
${input_password}       //input[@id="password"]
${textarea_address}    //textarea[@id="address"]

#VARIÁVEIS DE BOTÕES
${btn_submit}

#VARIÁVEIS DE RADIO E CHECKBOX
${radio_group}          optionsRadios
${checkbox_monday}     //input[@id="monday"]
${checkbox_sunday}    //input[@id="sunday"]

#VARIÁVEIS DO DROPDOWN
${dropdwon}    //select[@class="custom-select"]
${dropdwon_opcao}    //option[@value="5"]

*** Keywords ***
Dado o site de testes
    Open Browser    https://itera-qa.azurewebsites.net/home/automation    chrome

Quando preencho os campos
    Input Text    ${input_name}        Nome    
    Input Text    ${input_phone}       Telefone    
    Input Text    ${input_email}       email@email.com    
    Input Text    ${input_password}    minha_senha  
    Input Text    ${textarea_address}  meu_endereço


Então clico em submit
    Click Element    ${btn_submit}

Então feche o site
    Close Browser

E seleciono um radio
    Select Radio Button    ${radio_group}    option2

E seleciono um checkbox
    Select Checkbox      ${checkbox_monday}
    Select Checkbox      ${checkbox_sunday}
    Unselect Checkbox    ${checkbox_monday}

E clico no dropdown
    Click Element    ${dropdwon}
E clico em uma opcao
    Wait Until Element Is Visible    ${dropdwon_opcao}   0.5
    Click Element    ${dropdwon_opcao}

*** Test Cases ***
Case 1: Teste de inputs
    Dado o site de testes
    Quando preencho os campos
    Então clico em submit

Case 2: Teste de Radio e Checkbox
    E seleciono um radio
    E seleciono um checkbox

Case 3 Teste de dropdown:
    E clico no dropdown
    E clico em uma opcao