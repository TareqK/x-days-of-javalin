/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.conduit.run;

import io.javalin.Javalin;

/**
 *
 * @author tareq
 */
public class Main {

    public static void main(String[] args) {
        Javalin app = Javalin.create();
        app.get("/", ctx->{
            ctx.result("Hi Mom!");
        });
        app.start(8080);
    }
}
