#!/bin/bash

#Habilitar permissão
# chmod 777 op2.sh
#Executa o script  e salva o registro no DirShell01
# ./op2.sh | tee /home/ubuntu/DirShell01/resultado.txt

#Criação dos diretórios, caso não existam
if ["/home/ubuntu/DirShell01" && "/home/ubuntu/DirShell02"]
then echo "O diretório já existe"
else
mkdir DirShell01
mkdir DirShell02
fi

#Invocação da classe java que executa as quatro operações.
java op

#Move o registro do DirShell01 para DirShell02
mv /home/ubuntu/DirShell01/resultado.txt -t /home/ubuntu/DirShell02