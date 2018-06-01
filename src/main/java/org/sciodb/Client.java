package org.sciodb;

import org.apache.commons.cli.*;

import java.util.Scanner;

public class Client {

    public static void main(String[] args) {
        final Client client = new Client();

        client.parseParameters(args);
        client.newLine();
    }

    public void parseParameters(String[] args) {
        final Options options = new Options();

        options.addOption("h", "help", false, "help, ...");

        try {
            final CommandLineParser parser = new DefaultParser();
            final CommandLine cmd = parser.parse(options, args);

            if (cmd.hasOption("h")) {
                final HelpFormatter formatter = new HelpFormatter();
                formatter.printHelp( "h", options );
            }
        } catch (ParseException parse) {}
    }

    public void newLine() {
        System.out.print("# ");
        Scanner scanner = new Scanner(System.in);
        String username = scanner.nextLine();
        System.out.println("introduced >> " + username);
    }

    public void connect(final String serverLocation) {

    }
}
