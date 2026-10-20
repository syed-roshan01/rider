.class public final Lk0/h1;
.super Ljava/lang/Object;

# interfaces
.implements Lj0/w;


# static fields
.field public static final a:Lk0/h1;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lk0/h1;

    invoke-direct {v0}, Lk0/h1;-><init>()V

    sput-object v0, Lk0/h1;->a:Lk0/h1;

    return-void
.end method


# virtual methods
.method public final a(Lm0/m;)Lj0/h;
    .locals 7

    const/4 v1, 0x0

    const/4 v5, 0x0

    const-string v3, "\u06e6\u06df\u06e7"

    move-object v0, v1

    move-object v2, v1

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v3}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    sget v6, Lcom/google/firebase/firebase_analytics/ۦۡۢۢ;->۟ۤۤۨۤ:I

    const-string v1, "\u06e5\u06e2\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_0
    move-object v0, p1

    check-cast v0, Lm0/q;

    const-string v1, "\u06e3\u06e2\u06e8"

    move-object v3, v1

    goto :goto_0

    :sswitch_1
    invoke-static {}, Lh7/ۥۥۢ۟;->ۤ۠۠ۦ()Lj0/h;

    move-result-object v1

    const-string v3, "\u06e4\u06df"

    move-object v2, v1

    goto :goto_0

    :sswitch_2
    const v1, -0x4ca3341c

    xor-int v4, v1, v6

    const-string v1, "\u06e1\u06e1\u06e3"

    move-object v3, v1

    goto :goto_0

    :sswitch_3
    invoke-static {v0, v4}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    const-string v1, "\u06e6\u06df\u06e6"

    move-object v3, v1

    goto :goto_0

    :sswitch_4
    invoke-static {v0, v5}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    const-string v1, "\u06df\u06e8\u06df"

    move-object v3, v1

    goto :goto_0

    :sswitch_5
    return-object v2

    :sswitch_data_0
    .sparse-switch
        0xdc7b -> :sswitch_4
        0x1aa816 -> :sswitch_5
        0x1aaec3 -> :sswitch_3
        0x1abde2 -> :sswitch_2
        0x1ac14d -> :sswitch_1
        0x1ac14e -> :sswitch_0
    .end sparse-switch
.end method

.method public final b(Lm0/m;)J
    .locals 11

    const/4 v9, 0x0

    const/4 v0, 0x0

    const-wide/16 v6, 0x0

    const-string v5, "\u06e5\u06e8\u06e6"

    move-object v2, v0

    move-object v3, v0

    move-object v1, v0

    move-object v4, v0

    move v8, v9

    move v10, v9

    :goto_0
    invoke-static {v5}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v0

    sparse-switch v0, :sswitch_data_0

    const v0, 0x7ac103a9

    xor-int v8, v0, v10

    const-string v0, "\u06e2\u06e7\u06e3"

    move-object v5, v0

    goto :goto_0

    :sswitch_0
    invoke-static {v2, v9}, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۥۢۢ(Ljava/lang/Object;Z)V

    const-string v0, "\u06e3\u06e0\u06e1"

    move-object v5, v0

    goto :goto_0

    :sswitch_1
    invoke-static {v4}, Lw0/۟ۤۧۥۥ;->۟ۦۤۢۥ(Ljava/lang/Object;)J

    move-result-wide v6

    const-string v0, "\u06e6\u06e4\u06e8"

    move-object v5, v0

    goto :goto_0

    :sswitch_2
    invoke-static {v2, v8}, Le2/۟ۤۢۦ;->۟ۡۥ(Ljava/lang/Object;I)V

    const-string v0, "\u06e2\u06e3\u06e2"

    move-object v5, v0

    goto :goto_0

    :sswitch_3
    invoke-static {v2, v3}, Ly/ۤۨۧ۟;->ۣ۟ۨۧۧ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    const-string v0, "\u06e8\u06e7\u06e3"

    move-object v5, v0

    goto :goto_0

    :sswitch_4
    move-object v0, p1

    check-cast v0, Lm0/q;

    const-string v5, "\u06e7\u06e6\u06e2"

    move-object v2, v0

    goto :goto_0

    :sswitch_5
    sget v10, Lcom/google/firebase/components/ۧ۠ۤۤ;->۟ۥۤ۠۠:I

    const-string v0, "\u06df\u06e8\u06e3"

    move-object v5, v0

    goto :goto_0

    :sswitch_6
    invoke-static {}, Lcom/google/firebase/abt/۟ۡۥۢۨ;->ۣ۠ۥۦ()Lm0/p0;

    move-result-object v0

    const-string v5, "\u06e1\u06e7\u06e8"

    move-object v3, v0

    goto :goto_0

    :sswitch_7
    move-object v0, v1

    check-cast v0, Le1/r;

    const-string v5, "\u06e3\u06e5"

    move-object v4, v0

    goto :goto_0

    :sswitch_8
    return-wide v6

    nop

    :sswitch_data_0
    .sparse-switch
        0xdc62 -> :sswitch_1
        0x1aaf82 -> :sswitch_3
        0x1ab2c1 -> :sswitch_6
        0x1ab33e -> :sswitch_2
        0x1ab624 -> :sswitch_8
        0x1abea3 -> :sswitch_4
        0x1ac1ea -> :sswitch_0
        0x1ac5e3 -> :sswitch_5
        0x1ac9c4 -> :sswitch_7
    .end sparse-switch
.end method
