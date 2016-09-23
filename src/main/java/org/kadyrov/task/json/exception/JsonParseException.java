package org.kadyrov.task.json.exception;

/**
 * Exception throws if reader cannot parse value
 */
public class JsonParseException extends JsonException{
    public JsonParseException(Throwable cause) {
        super(cause);
    }
}
