---
title: Welcome! 
description: About the course (who, what, why), plan, pre-requisites, and structure.
layout: home
next_page: introduction/introduction
nav_order: 1
---

# Welcome!  
Hello There! My Name is [Tareq Kirresh](https://www.linkedin.com/in/tareq-kirresh){:target="_blank"}, software engineer and open source
contributor & advocate. X-Days of Javalin is a self-study course/camp I made based on my experiences that aims to 
get you up and running in developing fullstack web-applications in javalin. The Stack you see here based on a holistic approach
to technology, based on specialized individual libraries and tools, which make a great addition to any software engineer's toolbox, that 
add up to a complete stack which works great for both prototyping and quick development of web applications.
At the end of this course, you should be able to 

1. Write Rest APIs using [Javalin](https://javalin.io){:target="_blank"}
2. Manage your Data in [MariaDB](https://mariadb.org/){:target="_blank"}/[MySQL](https://www.mysql.com/){:target="_blank"} using [JDBI](https://jdbi.org){:target="_blank"}
4. Version and Manage a Schema as Code Using [FlyWay](https://flywaydb.org){:target="_blank"}
3. Create and Integrate a Frontend using [JavalinVue](https://javalin.io/plugins/javalinvue){:target="_blank"}
5. Deploy your web application on a public cloud using [Docker](https://docker.io){:target="_blank"} and [Heroku](https://heroku.com){:target="_blank"}

Along the way, you will be exposed to various concepts and terminologies, and where possible, you will have tonnes of outlinks if
you want to dive deeper into an aspect, or for your general knowledge.

This course is highly opinionated - the development flow and structure might not be the optimal flow for *your* case or organization,
and the implementation here can be done in several different ways. This course is by no means the authority for developing fullstack applications using javalin, and the design and architecture patterns used here are by no means the only viable or even best ones.

X-Days of Javalin is *not* a full code camp that will take you from zero to hero in development, and you should not treat it as such.

# Pre-Requisites
To get the best out of this course, you should at least

1. Have a good grasp of Java syntax and Object-Oriented programming
2. Have a beginner understanding of JavaScript syntax
3. Have a good understanding of HTML5 and CSS
4. Have a beginner understanding of SQL - preferably MySQL syntax
5. Have a working understanding of git
6. Be Generally comfortable(or willing to get comfortable) with the commandline

I encourage you to revise these concepts before you dive in. It would also be nice to have a general awareness of

1. Design Patterns
2. S.O.L.I.D Principles

# Structure & Plan
For this course, we will be building a (simplified) clone of [Medium](https://medium.com){:target="_blank"}. This will be done across 6 modules, with each module being composed of multiple days of learning - but may take you longer or less time  to complete - this course is completely self-paced. The 6 modules are

1. Introduction
2. Javalin Concepts
3. SQL and JDBI
4. SQL and Flyway 
5. Frontend with JavalinVue
6. Containerization and Deployment

The application code will progressively be enhanced day by day, so you can follow through the changes as they happen. Each day will have its
own page, with the rationale behind the change and resources to better understand the underlying concept. It is highly encouraged to follow 
along locally and experiment.

# Acknowledgements 
Special thanks to [David Åse](https://github.com/tipsy){:target="_blank"} for creating and maintaining javalin, and to the flyway, javalin, 
vue, docker, and JDBI maintainers and contributor community for their hard work that gave us the tech on which we can build our ideas. 
Additionally thanks go to [Thinkster](https://thinkster.io){:target="_blank"} for their 
[RealWorld](https://github.com/gothinkster/realworld){:target="_blank"} demo app idea, which heavily inspired the project this course uses as 
an example. Lastly, I'd like to thank the [Jekyll](https://jekyllrb.com/){:target="_blank"} and 
[Reveal.js](https://revealjs.com/){:target="_blank"} communities, without whom this website wouldn't even exist.

{% include pager.html %}