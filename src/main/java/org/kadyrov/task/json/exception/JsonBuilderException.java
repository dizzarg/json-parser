package org.kadyrov.task.json.exception;

/**
 * Exception throws if writer cannot create node from object value
 */
public class JsonBuilderException extends JsonException {

    public JsonBuilderException(Throwable cause) {
        super(cause);
    }
}
