class User {
    String userid
    byte[] avatar
    String avatarType
    static constraints = {
        avatar(nullable:true, maxSize: 16384 /* 16K */)
        avatarType(nullable:true)
    }
}