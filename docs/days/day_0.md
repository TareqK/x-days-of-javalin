---
layout: day
parent: Introduction
title: "Day 0 : Setup and Configuration"
nav_order: 1
has_children: false
description: Introduction | Installing all the tools and bits you need.
next_page: ../days/day_1
previous_page: ../introduction/introduction
has_toc: no
---

# Day 0 : Setup and configuration

## Outline
In this day, we will be setting up your local environment, downloading all the tools you need and explaining what they are and what they
are used for. For this course, we will need the following tools installed

1. JDK 11
2. Your Java IDE of choice
3. Maven
4. Docker
5. MariaDB/MySQL
6. DBeaver
7. Git
8. Heroku CLI
9. Postman

## JDK 11
JDK stands for **J**ava **D**evelopment **K**it, which is a set of tools and libs for developing
and debugging java applications.  I Recommend you download and install [AdoptOpenJDK](https://adoptopenjdk.net/){:target="_blank"} (use the Hotspot JVM), which provides a convenient installer
and packages for Linux, Windows, and Mac

## Your IDE of Choice
Your choice of IDE is entirely up to you. Personally, I'm fairly old-school when it comes to my IDEs, so my IDE of choice is 
[Apache NetBeans](https://netbeans.apache.org/){:target="_blank"}. However, there are a lot of IDEs you can pick from, including but not
limited to

- [Apache NetBeans](https://netbeans.apache.org/){:target="_blank"}
- [JetBrains IntelliJ IDEA](https://www.jetbrains.com/idea/download/){:target="_blank"}
- [Eclipse](https://www.eclipse.org/downloads/){:target="_blank"}
- [Visual Studio Code](https://code.visualstudio.com/){:target="_blank"}

Your IDE is an entirely personal choice, and you should use what works for you. Any Maven-Compatible IDE will work just fine.

We will also be working with vue files and HTML/CSS/JS files, so it makes sense that your IDE has syntax highlighting and formatting support for
those as well. Most IDEs should work fine here.

## Maven
For this course, We will be using [Maven](https://maven.apache.org/){:target="_blank"} as our build tool and dependency management system. You 
can find detailed instructions on installing it on the [Maven Website](https://maven.apache.org/install.html){:target="_blank"}. If you are using IntelliJ IDEA or Apache NetBeans as your IDE, they come with Maven support by Default. for Eclipse, you will
need the [M2E](https://www.eclipse.org/m2e/){:target="_blank"} plugin installed. For Visual Studio Code, you will need to install 
[Extension Pack for Java](https://marketplace.visualstudio.com/items?itemName=vscjava.vscode-java-pack){:target="_blank"}.

## Docker
You will need to install [Docker](https://www.docker.com/){:target="_blank"}, which we will use to build and run containers(more on this later 
in the course) for deploying our application. You can use [Docker Desktop](https://www.docker.com/products/docker-desktop/){:target="_blank"}. 
On Windows, you need to enable 
[Linux Containers](https://docs.docker.com/desktop/windows/#switch-between-windows-and-linux-containers){:target="_blank"} for this course. On 
Linux, you should consult the [Install Instructions](https://docs.docker.com/desktop/linux/install/){:target="_blank"} for your Distro of 
choice.

## MariaDB/MySQL
We will be using [MariaDB](https://mariadb.org/download/?t=mariadb&p=mariadb&r=10.6.7){:target="_blank"} 
/[MySQL](https://dev.mysql.com/downloads/mysql/){:target="_blank"} as our database for this course. My recommendation is that you install use 
MariaDB, as it's open source license is more permissive. We will use MariaDB version 10.6.x, or If you intend to use MySQL, 
MySQL version 8.0.x. 

## DBeaver
While working on the database, you will want to look into it, maybe do some debugging and querying, or even test out some SQL statements.
I Recommend using [DBeaver Community Edition](https://dbeaver.io/download/){:target="_blank"}, which has plug and play connectors for both MariaDB and MySQL. You can also use MySQL workbench, or if you are already experienced with SQL, you can use the MySQL or MariaDB CLI.


## Git
In order to clone and work with the code for this course locally, you will need a Git Desktop Client, such as [Github Desktop](https://desktop.github.com/){:target="_blank"} or [Sourcetree](https://www.sourcetreeapp.com/){:target="_blank"} installed. You will also need the Git CLI installed, which is available on the [Git Website](https://git-scm.com/downloads){:target="_blank"}.


## Heroku CLI
Heroku is a cloud-based Platform as a Service(PaaS) provider that lets us host our web applications without worrying about the underlying 
infrastructure. We will be using the Heroku CLI to deploy our finished application to Heroku. You can find install instructions for all 
platforms on the [Heroku DevCenter](https://devcenter.heroku.com/articles/heroku-cli#install-the-heroku-cli){:target="_blank"}.

## Postman
During development, you will need to test out and debug the REST APIs we wrote. I Recommend using Postman for this, which you can 
download from the [Postman Website](https://www.postman.com/downloads/){:target="_blank"}. You can also use any equivalent REST API client such 
as [Insomnia](https://insomnia.rest/){:target="_blank"}

Now that you have installed all the tools we need, and made sure they are all (hopefully) running correctly, 
let's get started with our project.

