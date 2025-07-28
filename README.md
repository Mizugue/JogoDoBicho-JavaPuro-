Este repositório contém um sistema completo de correção Jogo do Bicho, baseado em uma bateria de testes que fiz para o projeto https://github.com/Mizugue/JogoDoBichoMS. Achei plausível refatorar certas lógicas e estruturas de código para implementar um programa com esse objetivo nessa linguagem, especialmente considerando que, algum tempo atrás, já havia desenvolvido algo semelhante em Python: https://github.com/Mizugue/JogoDoBicho   

- > 24 Tipos de apostas com toda uma lógica de correção (MILHAR_SECA,
    MILHAR_CERCADA,
    MILHAR_INVERTIDA_SECA,
    MILHAR_INVERTIDA_CERCADA,
    CENTENA_SECA,
    CENTENA_CERCADA,
    CENTENA_INVERTIDA_SECA,
    CENTENA_INVERTIDA_CERCADA,
    DEZENA_SECA,
    DEZENA_CERCADA,
    DEZENA_INVERTIDA_SECA,
    DEZENA_INVERTIDA_CERCADA,
    DUQUE_DE_DEZENA,
    TERNO_DE_DEZENA,
    GRUPO_SECO,
    GRUPO_CERCADO,
    DUPLA_DE_GRUPO_SECO,
    DUPLA_DE_GRUPO_CERCADO,
    TERNO_DE_GRUPO_SECO,
    TERNO_DE_GRUPO_CERCADO,
    PASSE_SECO,
    PASSE_CERCADO,
    PASSE_INVERTIDO_SECO,
    PASSE_INVERTIDO_CERCADO)
  
- Este projeto utiliza a biblioteca JSoup para realizar o web scraping do site resultadofacil.com.br, de onde é extraído automaticamente o último resultado da Loteria Federal. A partir dessa coleta e da input do user, o sistema aplica a lógica de correção de resultados para 24 tipos diferentes de apostas do Jogo do Bicho.

