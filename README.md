# 📱 Iphone

Este projeto consiste em uma **implementação em Java** do diagrama UML localizado no diretório(o mesmo que também segue abaixo) [`uml/`](uml/). Esse diagrama representa a arquitetura e o design do projeto.

---

```mermaid
---
config:
  theme: neo-dark
  layout: dagre
title: Iphone
---
classDiagram
direction TB
    class Iphone {
    }
    class ReprodutorMusical {
	    +tocar()
	    +pausar()
	    +selecionarMusica(String musica)
    }
    class AparelhoTelefonico {
	    +ligar(String numero)
	    +atender()
	    +inciarCorreioVoz()
    }
    class NavegadorNaInternet {
	    +exibirPagina(String url)
	    +adicionarNovaAba()
	    +atualizarPagina()
    }
	<<interface>> ReprodutorMusical
	<<interface>> AparelhoTelefonico
	<<interface>> NavegadorNaInternet
    ReprodutorMusical <|.. Iphone : implements
    AparelhoTelefonico <|.. Iphone : implements
    NavegadorNaInternet <|.. Iphone : implements

