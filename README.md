# concurrent-euler
Projeto para disciplina de Programação Concorrente - DIMAP

## Sobre

Este projeto faz o cálculo no múemro de euler (e) utilizando três variações de Thread Pool providos pelo framework 
Executor do Java Concurrency Utilities.

## Estrutura 

```
+─concurrent-euler                   
  ├─── docs                    
  └─── fixed 
         └──src
            └──main  
                └──java
                  └──com
                      └──example
                         └─── Calculator.java          
                         └─── EulerTermCalculator.java
  ├── cached                      
       └──src
            └──main  
                └──java
                  └──com
                      └──example
                         └─── Calculator.java          
                         └─── EulerTermCalculator.java
  ├── work-stealing                     
       └──src
            └──main  
                └──java
                  └──com
                      └──example
                         └─── Calculator.java          
                         └─── EulerTermCalculator.java
       
```
## Executar 

Para executar o programa, faça o clone do projeto e importe a aplicação como um projeto Java Maven em sua IDE. 
Faça o build e execute o arquivo Calculator.java referente a versão de Thread Pool que deseja testar 
(Fixed, cached ou Work Stealing Thread Pool) em seu respectivo diretório. 
