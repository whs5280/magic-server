package com.magic.common.custom;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringBootVersion;
import org.springframework.boot.ansi.AnsiColor;
import org.springframework.boot.ansi.AnsiOutput;
import org.springframework.boot.ansi.AnsiStyle;
import org.springframework.core.env.Environment;

import java.io.PrintStream;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class MagicBanner implements Banner {

    private static final String[] BANNER = { "", "  .   ____          _            __ _ _",
            " /\\\\ / ___'_ __ _ _(_)_ __  __ _ \\ \\ \\ \\", "( ( )\\___ | '_ | '_| | '_ \\/ _` | \\ \\ \\ \\",
            " \\\\/  ___)| |_)| | | | | || (_| |  ) ) ) )", "  '  |____| .__|_| |_|_| |_\\__, | / / / /",
            " =========|_|==============|___/=/_/_/_/" };

    private static final String SPRING_BOOT = " :: Spring Boot :: ";

    private static final int STRAP_LINE_SIZE = 42;
    @Override
    public void printBanner(Environment environment, Class<?> sourceClass, PrintStream printStream) {
        System.out.println("\033[36m   █████▒█    ██  ▄████▄   ██ ▄█▀       ██████╗ ██╗   ██╗ ██████╗\033[0m");
        System.out.println("\033[36m ▓██   ▒ ██  ▓██▒▒██▀ ▀█   ██▄█▒        ██╔══██╗██║   ██║██╔════╝\033[0m");
        System.out.println("\033[36m ▒████ ░▓██  ▒██░▒▓█    ▄ ▓███▄░        ██████╔╝██║   ██║██║  ███╗\033[0m");
        System.out.println("\033[36m ░▓█▒  ░▓▓█  ░██░▒▓▓▄ ▄██▒▓██ █▄        ██╔══██╗██║   ██║██║   ██║\033[0m");
        System.out.println("\033[34m ░▒█░   ▒▒█████▓ ▒ ▓███▀ ░▒██▒ █▄       ██████╔╝╚██████╔╝╚██████╔╝\033[0m");
        System.out.println("\033[34m  ▒ ░   ░▒▓▒ ▒ ▒ ░ ░▒ ▒  ░▒ ▒▒ ▓▒       ╚═════╝  ╚═════╝  ╚═════╝\033[0m");
        System.out.println("\033[35m  ░     ░░▒░ ░ ░   ░  ▒   ░ ░▒ ▒░\033[0m");
        System.out.println("\033[33m  ░ ░    ░░░ ░ ░ ░        ░ ░░ ░\033[0m");
        System.out.println("\033[37m           ░     ░ ░      ░  ░\033[0m");

        System.out.println("Author: whs");
        System.out.println("Github: https://github.com/whs5280");
        System.out.println("Version: 1.0.0");
        System.out.println("");

        System.out.println("********************************************当前服务相关地址********************************************");
        String ip = "IP";

        try {
            ip = InetAddress.getLocalHost().getHostAddress();
        } catch (UnknownHostException var8) {
            System.out.println("当前服务地址获取失败");
        }

        String externUrl = "http://" + String.format("%s:%s", ip, environment.getProperty("server.port"));
        System.out.printf("服务启动成功! Access URLs:\n\t接口本地地址: \t\t%s\n", externUrl);

        for (String line : BANNER) {
            printStream.println(line);
        }
        String version = SpringBootVersion.getVersion();
        version = " (v" + version + ")";
        StringBuilder padding = new StringBuilder();
        while (padding.length() < STRAP_LINE_SIZE - (version.length() + SPRING_BOOT.length())) {
            padding.append(" ");
        }

        printStream.println(AnsiOutput.toString(AnsiColor.GREEN, SPRING_BOOT, AnsiColor.DEFAULT, padding.toString(),
                AnsiStyle.FAINT, version));
        printStream.println();
    }
}
