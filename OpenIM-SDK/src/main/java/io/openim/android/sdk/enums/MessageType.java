package io.openim.android.sdk.enums;

/**
 * 消息类型
 */
public class MessageType {
    /**
     * 文本
     */
    static final int TEXT = 101;
    /**
     * 图片
     */
    static final int PICTURE = 102;
    /**
     * 声音
     */
    static final int VOICE = 103;
    /**
     * 视频
     */
    static final int VIDEO = 104;
    /**
     * 文件
     */
    static final int FILE = 105;
    /**
     * _@消息
     */
    static final int AT_TEXT = 106;
    /**
     * 合并
     */
    static final int MERGER = 107;
    /**
     * 撤回
     */
    static final int REVOKE = 111;
    /**
     * 已读
     */
    static final int HAS_READ_RECEIPT = 112;
    /**
     * 正在输入
     */
    static final int TYPING = 113;

    ///
    static final int ACCEPT_FRIEND = 201;
    static final int ADD_FRIEND = 202;
    static final int REFUSE_FRIEND_APPLICATION = 203;
    static final int SET_SELF_INFO = 204;
    static final int REVOKE_MESSAGE = 205;
    static final int C2C_MESSAGE_AS_READ = 206;
    static final int KICK_ONLINE = 303;

    ///
    static final int TRANSFER_GROUP_OWNER = 501;
    static final int CREATE_GROUP = 502;

    // static const create_group = 503;
    static final int JOIN_GROUP = 504;
    static final int QUIT_GROUP = 505;
    static final int SET_GROUP_INFO = 506;
    static final int ACCEPT_GROUP_APPLICATION = 507;
    static final int REFUSE_GROUP_APPLICATION = 508;
    static final int KICK_GROUP_MEMBER = 509;
    static final int INVITED_USER_TO_GROUP = 510;
}