package AutoDanfeCadCliente;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Scanner;

public class apiCEP {
    private String rua;
    private String bairro;
    private String cidade;
    private String estado;

    public apiCEP(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        try {
            URL obj = new URL(url);
            HttpURLConnection con = (HttpURLConnection) obj.openConnection();
            con.setRequestMethod("GET");
            int responseCode = con.getResponseCode();
            if (responseCode == HttpURLConnection.HTTP_OK) {
                Scanner scanner = new Scanner(con.getInputStream(), "UTF-8");
                String response = scanner.useDelimiter("\\A").next();
                scanner.close();
                if (!response.isEmpty()) {
                    this.rua = getValueFromJsonString(response, "logradouro");
                    this.bairro = getValueFromJsonString(response, "bairro");
                    this.cidade = getValueFromJsonString(response, "localidade");
                    this.estado = getValueFromJsonString(response, "uf");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public String getRua() {
        return this.rua;
    }

    public String getBairro() {
        return this.bairro;
    }

    public String getCidade() {
        return this.cidade;
    }

    public String getEstado() {
        return this.estado;
    }

    private static String getValueFromJsonString(String jsonString, String key) {
        int keyStart = jsonString.indexOf("\"" + key + "\"");
        if (keyStart == -1) {
            return null;
        }
        int valueStart = jsonString.indexOf(":", keyStart) + 1;
        if (valueStart == -1) {
            return null;
        }
        int valueEnd;
        if (jsonString.charAt(valueStart) == '"') {
            valueStart++;
            valueEnd = jsonString.indexOf('"', valueStart);
        } else {
            valueEnd = jsonString.indexOf(',', valueStart);
            if (valueEnd == -1) {
                valueEnd = jsonString.indexOf('}', valueStart);
            }
        }
        if (valueEnd == -1) {
            return null;
        }
        return jsonString.substring(valueStart, valueEnd).replaceAll("\"", "");
    }
}
