*** Settings ***
Library    SeleniumLibrary

*** Variables ***
${input_name}         id:name
${input_phone}        id:phone
${input_email}        id:email
${input_password}     id:password
${textarea_address}   id:address
${button_submit}      name:submit


*** Keywords ***
Abrir site
    Open Browser    https://itera-qa.azurewebsites.net/home/automation    chrome

Preencher campos
    Input Text    ${input_name}          Nathan
    Input Text    ${input_phone}         982399985
    Input Text    ${input_email}         nafs2002@hotmail.com
    Input Text    ${input_password}      1234
    Input Text    ${textarea_address}    Remanso
    
Clicar em submit
    Click Element    ${button_submit}

Fechar navegador
    Close Browser


*** Test Cases ***
Cenário 1: Preencher formulário
    Abrir site
    Preencher campos
    Clicar em submit
    Fechar navegador

    