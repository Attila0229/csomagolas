package hu.progmatic.koszones.parlament;

import java.io.*;

public class FajlParlament extends Parlament {
    private String fajlnev;

    public FajlParlament(String fajlnev) {
        this.fajlnev = fajlnev;
    }

    public String getFajlnev() {
        return fajlnev;
    }


    @Override
    protected String load() {
        // try with resources
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fajlnev)))) {
            String adat = reader.readLine();
            return adat.trim();
        } catch (IOException e) {
            return null;
        }
    }

    @Override
    protected boolean save(String adat) {
        try (Writer writer = new OutputStreamWriter(new FileOutputStream(fajlnev))) {
            writer.write(adat);
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
}
