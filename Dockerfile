
# FROM openjdk:17-jdk-slim

# WORKDIR /app

# COPY target/ptfBackEnd-0.0.1-SNAPSHOT.jar /app/ptfBackEnd.jar

# EXPOSE 8080

# CMD ["java", "-jar", "ptfBackEnd.jar"]

# Etapa 1: Construção do JAR
FROM maven:3.8.6-openjdk-17 AS builder
WORKDIR /app

# Copia os arquivos do projeto
COPY . .

# Compila o projeto e gera o JAR
RUN mvn clean package -DskipTests

# Etapa 2: Construção da imagem final
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copia o JAR gerado na etapa anterior
COPY --from=builder /app/target/ptfBackEnd-0.0.1-SNAPSHOT.jar /app/ptfBackEnd.jar

# Expõe a porta da aplicação
EXPOSE 8080

# Comando para rodar a aplicação
CMD ["java", "-jar", "ptfBackEnd.jar"]

