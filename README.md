
[![CI](https://github.com/juliojld12/iwvg-devops-lozano-julioj/actions/workflows/continuous-integration.yml/badge.svg)](https://github.com/juliojld12/iwvg-devops-lozano-julioj/actions/workflows/continuous-integration.yml)
[![CD](https://github.com/juliojld12/iwvg-devops-lozano-julioj/actions/workflows/continuous-deployment.yml/badge.svg)](https://github.com/juliojld12/iwvg-devops-lozano-julioj/actions/workflows/continuous-deployment.yml)
[![Quality Gate Status](https://sonarcloud.io/api/project_badges/measure?project=Juliojld12_iwvg-devops-lozano-julioj&metric=alert_status)](https://sonarcloud.io/summary/new_code?id=<SONARCLOUD_PROJECT_KEY>)
[![Render](https://img.shields.io/badge/Render-Deployed-46E3B7?logo=render&logoColor=white)](https://<tu-app>.onrender.com)

---

## Descripción
Práctica DevOps IWVG - Julio Lozano

Proyecto Maven con CI/CD en GitHub Actions, análisis de calidad con SonarCloud y despliegue automático en Render.

## Scripts útiles

### Construir localmente
```bash
docker build -t iwvg-devops-lozano-julioj .
docker run -p 8080:8080 iwvg-devops-lozano-julioj
yaml
Copiar código
