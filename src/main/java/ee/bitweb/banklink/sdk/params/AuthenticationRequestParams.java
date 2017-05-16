package ee.bitweb.banklink.sdk.params;

public class AuthenticationRequestParams {

    protected String language;
    protected String encoding;

    protected String returnUri;

    public AuthenticationRequestParams() {}

    public AuthenticationRequestParams(String language, String encoding) {
        this();
        this.language = language;
        this.encoding = encoding;

    }

    public AuthenticationRequestParams(String language, String encoding, String returnUri) {
        this(language, encoding);
        this.returnUri = returnUri;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getReturnUri() {
        return returnUri;
    }

    public void setReturnUri(String returnUri) {
        this.returnUri = returnUri;
    }

    public void setIfNotDefinedLanguage(String language) {
        this.language = this.language == null ? language : this.language;
    }

    public void setIfNotDefinedEncoding(String encoding) {
        this.encoding = this.encoding == null ? encoding : this.encoding;
    }


}
