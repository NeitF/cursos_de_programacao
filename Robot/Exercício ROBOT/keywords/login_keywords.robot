*** Settings ***
Resource    ../Settings/settings.resource
Resource    ../xpaths/main_xpath.resource

*** Keywords ***
E realize o cadastro
    Click Link                         ${home.A_Account}
    Click Element                      ${home.A_Signup}
    Wait Until Element Is Visible      ${login.Input_PrimeiroNome}  10
    Input Text                         ${login.Input_PrimeiroNome}  ${PrimeiroNome}
    Wait Until Element Is Visible      ${login.Input_UltimoNome}    10
    Input Text                         ${login.Input_UltimoNome}    ${UltimoNome}     
    Wait Until Element Is Visible      ${login.Input_Telefone}      10   
    Input Text                         ${login.Input_Telefone}      ${Telefone}  
    Click Element                      ${login.btn_country}
    Input Text                         ${login.Input_country}       ${Pais} 
    Sleep                              3s
    Press Keys                         ${login.Input_country}       ENTER
    Wait Until Element Is Visible      ${login.Input_Email}         10
    Input Text                         ${login.Input_Email}         ${Email}  
    Wait Until Element Is Visible      ${login.Input_Senha}         10 
    Input Text                         ${login.Input_Senha}         ${Senha}
    Sleep                              5s       
    Click Element                      ${login.Button_Signup}

E faça o Login
    Wait Until Element Is Visible  ${home.A_Account}
    Click Link                     ${home.A_Account}
    Click Element                  ${login.A_OpcaoLogin} 
    Wait Until Element Is Visible  ${login.Input_EmailLogin}  10
    Input Text                     ${login.Input_EmailLogin}  ${Email}
    Wait Until Element Is Visible  ${login.Input_SenhaLogin}  10
    Input Text                     ${login.Input_SenhaLogin}  ${Senha}
    Wait Until Element Is Visible  ${login.Button_Logar}      10
    Click Element                  ${login.Button_Logar} 
    Sleep    10s