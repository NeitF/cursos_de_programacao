*** Settings ***
Resource    ../Settings/settings.resource
Resource    ../xpaths/main_xpath.resource

*** Keywords ***
Quando eu realizo uma busca de um vôo ida e volta
    Wait Until Element Is Visible  ${home.a_voos}           10
    Click Element                  ${home.a_voos}
    Wait Until Element Is Visible  ${voo.Input_IdaeVolta}  10
    Click Element                  ${voo.Input_IdaeVolta}


E saindo de ${Texto}
    Wait Until Element Is Visible  ${voo.Input_Ida}  10
    Input Text                     ${voo.Input_Ida}  ${voo.Texto}
    Press Keys                     ${voo.Input_Ida}  ARROW_DOWN
    Press Keys                     ${voo.Input_Ida}  ENTER 

E indo para ${Texto}


E saindo na data ${Texto}


E voltando na data ${Texto}

E acesso a página de visto
    Wait Until Element Is Visible  ${home.A_Visto}  10
    Click Element  ${home.A_Visto}

E informo o pais de origem sendo o ${Texto}
    Wait Until Element Is Visible  ${voo.Span_PaisOrigem}  10
    Click Element                  ${voo.Span_PaisOrigem}
    Wait Until Element Is Visible  ${voo.Input_InformaPaisOrigem}  10
    Input Text                     ${voo.Input_InformaPaisOrigem}  ${voo.Texto}
    Press Keys                     ${voo.Input_InformaPaisOrigem}  ENTER

E fecho o navegador
    Close Browser
