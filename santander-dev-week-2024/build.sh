#!/bin/bash

echo "Iniciando o script de build..."

# Verifica se o gradlew existe e é executável
if [ ! -f gradlew ]; then
    echo "Erro: gradlew não encontrado. Certifique-se de que o arquivo está presente."
    exit 1
fi

# Concede permissão de execução ao gradlew
chmod +x gradlew

# Executa o comando de limpeza do Gradle
echo "Executando ./gradlew clean..."
if ./gradlew clean; then
    echo "Limpeza concluída com sucesso."
else
    echo "Erro: falha ao executar ./gradlew clean."
    exit 1
fi


