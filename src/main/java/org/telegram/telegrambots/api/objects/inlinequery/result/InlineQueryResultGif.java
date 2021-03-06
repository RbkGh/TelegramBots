package org.telegram.telegrambots.api.objects.inlinequery.result;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.SerializerProvider;
import com.fasterxml.jackson.databind.jsontype.TypeSerializer;

import org.json.JSONObject;
import org.telegram.telegrambots.api.objects.inlinequery.inputmessagecontent.InputMessageContent;
import org.telegram.telegrambots.api.objects.replykeyboard.InlineKeyboardMarkup;

import java.io.IOException;

/**
 * @author Ruben Bermudez
 * @version 1.0
 * @brief Represents a link to an animated GIF file. By default, this animated GIF file will be sent
 * by the user with optional caption. Alternatively, you can use input_message_content to send a
 * message with the specified content instead of the animation.
 * @date 01 of January of 2016
 */
public class InlineQueryResultGif implements InlineQueryResult {

    private static final String TYPE_FIELD = "type";
    @JsonProperty(TYPE_FIELD)
    private static final String type = "gif"; ///< Type of the result, must be "gif"
    private static final String ID_FIELD = "id";
    private static final String GIFURL_FIELD = "gif_url";
    private static final String GIFWIDTH_FIELD = "gif_width";
    private static final String GIFHEIGHT_FIELD = "gif_height";
    private static final String THUMBURL_FIELD = "thumb_url";
    private static final String TITLE_FIELD = "title";
    private static final String CAPTION_FIELD = "caption";
    private static final String INPUTMESSAGECONTENT_FIELD = "input_message_content";
    private static final String REPLY_MARKUP_FIELD = "reply_markup";
    @JsonProperty(ID_FIELD)
    private String id; ///< Unique identifier of this result, 1-64 bytes
    @JsonProperty(GIFURL_FIELD)
    private String gifUrl; ///< A valid URL for the GIF file. File size must not exceed 1MB
    @JsonProperty(GIFWIDTH_FIELD)
    private Integer gifWidth; ///< Optional. Width of the GIF
    @JsonProperty(GIFHEIGHT_FIELD)
    private Integer gifHeight; ///< Optional. Height of the GIF
    @JsonProperty(THUMBURL_FIELD)
    private String thumbUrl; ///< Optional. URL of a static thumbnail for the result (jpeg or gif)
    @JsonProperty(TITLE_FIELD)
    private String title; ///< Optional. Title for the result
    @JsonProperty(CAPTION_FIELD)
    private String caption; ///< Optional. Caption of the GIF file to be sent
    @JsonProperty(INPUTMESSAGECONTENT_FIELD)
    private InputMessageContent inputMessageContent; ///< Optional. Content of the message to be sent instead of the GIF animation
    @JsonProperty(REPLY_MARKUP_FIELD)
    private InlineKeyboardMarkup replyMarkup; ///< Optional. Inline keyboard attached to the message

    public static String getType() {
        return type;
    }

    public String getId() {
        return id;
    }

    public InlineQueryResultGif setId(String id) {
        this.id = id;
        return this;
    }

    public String getGifUrl() {
        return gifUrl;
    }

    public InlineQueryResultGif setGifUrl(String gifUrl) {
        this.gifUrl = gifUrl;
        return this;
    }

    public Integer getGifWidth() {
        return gifWidth;
    }

    public InlineQueryResultGif setGifWidth(Integer gifWidth) {
        this.gifWidth = gifWidth;
        return this;
    }

    public Integer getGifHeight() {
        return gifHeight;
    }

    public InlineQueryResultGif setGifHeight(Integer gifHeight) {
        this.gifHeight = gifHeight;
        return this;
    }

    public String getThumbUrl() {
        return thumbUrl;
    }

    public InlineQueryResultGif setThumbUrl(String thumbUrl) {
        this.thumbUrl = thumbUrl;
        return this;
    }

    public String getTitle() {
        return title;
    }

    public InlineQueryResultGif setTitle(String title) {
        this.title = title;
        return this;
    }

    public String getCaption() {
        return caption;
    }

    public InlineQueryResultGif setCaption(String caption) {
        this.caption = caption;
        return this;
    }

    public InputMessageContent getInputMessageContent() {
        return inputMessageContent;
    }

    public InlineQueryResultGif setInputMessageContent(InputMessageContent inputMessageContent) {
        this.inputMessageContent = inputMessageContent;
        return this;
    }

    public InlineKeyboardMarkup getReplyMarkup() {
        return replyMarkup;
    }

    public InlineQueryResultGif setReplyMarkup(InlineKeyboardMarkup replyMarkup) {
        this.replyMarkup = replyMarkup;
        return this;
    }

    @Override
    public JSONObject toJson() {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put(TYPE_FIELD, type);
        jsonObject.put(ID_FIELD, this.id);
        jsonObject.put(GIFURL_FIELD, this.gifUrl);
        if (gifWidth != null) {
            jsonObject.put(GIFWIDTH_FIELD, this.gifWidth);
        }
        if (gifHeight != null) {
            jsonObject.put(GIFHEIGHT_FIELD, this.gifHeight);
        }
        if (thumbUrl != null) {
            jsonObject.put(THUMBURL_FIELD, this.thumbUrl);
        }
        if (title != null) {
            jsonObject.put(TITLE_FIELD, this.title);
        }
        if (caption != null) {
            jsonObject.put(CAPTION_FIELD, this.caption);
        }
        if (replyMarkup != null) {
            jsonObject.put(REPLY_MARKUP_FIELD, replyMarkup.toJson());
        }
        if (inputMessageContent != null) {
            jsonObject.put(INPUTMESSAGECONTENT_FIELD, inputMessageContent.toJson());
        }
        return jsonObject;
    }

    @Override
    public void serialize(JsonGenerator gen, SerializerProvider serializers) throws IOException {
        gen.writeStartObject();
        gen.writeStringField(TYPE_FIELD, type);
        gen.writeStringField(ID_FIELD, id);
        gen.writeStringField(GIFURL_FIELD, this.gifUrl);
        if (gifWidth != null) {
            gen.writeNumberField(GIFWIDTH_FIELD, this.gifWidth);
        }
        if (gifHeight != null) {
            gen.writeNumberField(GIFHEIGHT_FIELD, this.gifHeight);
        }
        if (thumbUrl != null) {
            gen.writeStringField(THUMBURL_FIELD, this.thumbUrl);
        }
        if (title != null) {
            gen.writeStringField(TITLE_FIELD, this.title);
        }
        if (caption != null) {
            gen.writeStringField(CAPTION_FIELD, this.caption);
        }
        if (replyMarkup != null) {
            gen.writeObjectField(REPLY_MARKUP_FIELD, replyMarkup);
        }
        if (inputMessageContent != null) {
            gen.writeObjectField(INPUTMESSAGECONTENT_FIELD, inputMessageContent);
        }
        gen.writeEndObject();
        gen.flush();
    }

    @Override
    public void serializeWithType(JsonGenerator gen, SerializerProvider serializers, TypeSerializer typeSer) throws IOException {
        serialize(gen, serializers);
    }

    @Override
    public String toString() {
        return "InlineQueryResultGif{" +
                "type='" + type + '\'' +
                ", id='" + id + '\'' +
                ", gifUrl='" + gifUrl + '\'' +
                ", gifWidth=" + gifWidth +
                ", gifHeight=" + gifHeight +
                ", thumbUrl='" + thumbUrl + '\'' +
                ", title='" + title + '\'' +
                ", caption='" + caption + '\'' +
                ", inputMessageContent='" + inputMessageContent + '\'' +
                ", replyMarkup='" + replyMarkup + '\'' +
                '}';
    }
}
