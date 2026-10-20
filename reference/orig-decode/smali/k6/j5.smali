.class public final Lk6/j5;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field private static final short:[S


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;

.field public final c:Ljava/lang/Object;

.field public final d:J

.field public final e:Ljava/lang/Object;

.field public final f:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x22

    new-array v0, v0, [S

    fill-array-data v0, :array_0

    sput-object v0, Lk6/j5;->short:[S

    return-void

    :array_0
    .array-data 2
        0x48es
        0x49es
        0x48fs
        0x498s
        0x498s
        0x493s
        0x4a2s
        0x493s
        0x49cs
        0x490s
        0x498s
        0x13bs
        0x12bs
        0x13as
        0x12ds
        0x12ds
        0x126s
        0x117s
        0x12bs
        0x124s
        0x129s
        0x13bs
        0x13bs
        0x484s
        0x494s
        0x485s
        0x492s
        0x492s
        0x499s
        0x4a8s
        0x481s
        0x49es
        0x492s
        0x480s
    .end array-data
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JI)V
    .locals 3

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p7, p0, Lk6/j5;->a:I

    iput-object p1, p0, Lk6/j5;->f:Ljava/lang/Object;

    iput-object p2, p0, Lk6/j5;->b:Ljava/lang/Object;

    iput-object p3, p0, Lk6/j5;->c:Ljava/lang/Object;

    iput-object p4, p0, Lk6/j5;->e:Ljava/lang/Object;

    iput-wide p5, p0, Lk6/j5;->d:J

    invoke-static {}, Landroidx/fragment/app/ۣۣۣۨ;->ۣۣۣ۟ۥ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "MF9fCYQuauizdvGHvZRqkVreSfM"

    invoke-static {v0}, Lg7/۠ۤۧ;->ۢۥۡ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public static ۡۧ۟ۤ()[S
    .locals 2

    invoke-static {}, Lg5/ۣۡۦۣ;->۟ۢۤ۟ۡ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    sget-object v0, Lk6/j5;->short:[S

    :sswitch_3
    return-object v0

    :sswitch_4
    const/4 v0, 0x0

    const/16 v1, 0x6cc

    :goto_1
    xor-int/lit16 v1, v1, 0x6dd

    sparse-switch v1, :sswitch_data_1

    goto :goto_1

    :sswitch_5
    const/16 v1, 0x6eb

    goto :goto_1

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_4
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_5
        0x36 -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final run()V
    .locals 14

    const/4 v13, 0x0

    const/4 v12, 0x0

    invoke-static {p0}, Landroidx/profileinstaller/۟۟۟ۧۦ;->۟ۦۨۥۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p0}, Lcom/google/android/gms/auth/api/signin/ۦ۟;->ۣۨۧۧ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Ld9/ۧۧۨۥ;->۟ۦ۟ۢ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-static {p0}, Lcom/google/firebase/annotations/concurrent/ۧ۠ۡۨ;->ۣ۟ۡ۟ۢ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    invoke-static {p0}, Lcom/google/firebase/messaging/reporting/ۦۦۦۥ;->ۣۣۥۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    packed-switch v0, :pswitch_data_0

    check-cast v1, Lk6/p6;

    move-object v0, v2

    check-cast v0, Landroid/os/Bundle;

    move-object v2, v4

    check-cast v2, Lk6/q6;

    check-cast v3, Lk6/q6;

    invoke-static {p0}, Lp0/۟ۢۤۧ;->ۨۡۨ۠(Ljava/lang/Object;)J

    move-result-wide v4

    const/16 v6, 0x650

    :goto_0
    xor-int/lit16 v6, v6, 0x661

    sparse-switch v6, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v6, 0x68e

    goto :goto_0

    :sswitch_1
    if-eqz v0, :cond_0

    const/16 v6, 0x6ad

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lk6/j5;->ۡۧ۟ۤ()[S

    move-result-object v6

    sget v7, Lm9/۟ۤۢۦ۠;->ۥۣۤ۠:I

    xor-int/lit16 v7, v7, 0x132

    const/16 v8, 0x4fd

    invoke-static {v6, v12, v7, v8}, Ldagger/hilt/android/internal/migration/ۣۣۣۥ;->۟ۧۤۢ۟([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Lb8/ۣ۟ۨۢۥ;->ۧۤۧۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {}, Lk6/j5;->ۡۧ۟ۤ()[S

    move-result-object v6

    const/16 v7, 0xb

    sget v8, Landroidx/compose/foundation/layout/۟ۥۦۣۨ;->ۣ۟ۡ۟ۡ:I

    xor-int/lit16 v8, v8, -0x2a6

    const/16 v9, 0x148

    invoke-static {v6, v7, v8, v9}, Lc7/۟ۦۣۢۦ;->ۨۦ۠ۥ([SIII)Ljava/lang/String;

    move-result-object v6

    invoke-static {v0, v6}, Lb8/ۣ۟ۨۢۥ;->ۧۤۧۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :sswitch_3
    const/4 v6, 0x1

    invoke-static {v1}, Lm5/۟ۥۣۧۥ;->۠ۧ۠ۥ(Ljava/lang/Object;)Lk6/u7;

    move-result-object v7

    invoke-static {}, Lk6/j5;->ۡۧ۟ۤ()[S

    move-result-object v8

    const/16 v9, 0x17

    sget v10, Lea/ۦۦۨۨ;->۟۠ۧ۠۟:I

    xor-int/lit16 v10, v10, 0x2f5

    const/16 v11, 0x4f7

    invoke-static {v8, v9, v10, v11}, Lx5/ۡۦۦۥ;->۟ۨۤ۠([SIII)Ljava/lang/String;

    move-result-object v8

    invoke-static {v7, v8, v0, v13, v12}, Lq6/ۡۨۧۨ;->ۥ۟ۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)Landroid/os/Bundle;

    move-result-object v7

    invoke-static/range {v1 .. v7}, Lh4/ۣ۟ۢۢۡ;->۟۟ۦۤۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;JZLjava/lang/Object;)V

    invoke-static {}, Lt7/۟ۡ۠ۨ۟;->ۣۨۨ()I

    move-result v1

    const/16 v0, 0x6cc

    :goto_1
    xor-int/lit16 v0, v0, 0x6dd

    sparse-switch v0, :sswitch_data_1

    goto :goto_1

    :sswitch_4
    if-ltz v1, :cond_1

    const/16 v0, 0x729

    goto :goto_1

    :cond_1
    :sswitch_5
    const/16 v0, 0x70a

    goto :goto_1

    :sswitch_6
    const-string v0, "gBn9oiffhp7B9kUzc3"

    invoke-static {v0}, Lg5/۟ۥۨۤ;->۟ۦۧ۠ۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :goto_2
    :sswitch_7
    return-void

    :pswitch_0
    move-object v0, v1

    check-cast v0, Lk6/y5;

    move-object v1, v2

    check-cast v1, Ljava/lang/String;

    move-object v2, v4

    check-cast v2, Ljava/lang/String;

    invoke-static {p0}, Lp0/۟ۢۤۧ;->ۨۡۨ۠(Ljava/lang/Object;)J

    move-result-wide v4

    invoke-static/range {v0 .. v5}, Ld9/ۨۧۧۦ;->ۣ۠ۧ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;J)V

    goto :goto_2

    :pswitch_1
    check-cast v2, Ljava/lang/String;

    const/16 v0, 0x748

    :goto_3
    xor-int/lit16 v0, v0, 0x759

    sparse-switch v0, :sswitch_data_2

    goto :goto_3

    :sswitch_8
    if-nez v2, :cond_2

    const v0, 0xbe60

    goto :goto_3

    :cond_2
    :sswitch_9
    const v0, 0xbe41

    goto :goto_3

    :sswitch_a
    check-cast v1, Lk6/h5;

    invoke-static {v1}, Lf/ۣ۟ۤۤ;->ۦۣ۠ۥ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v1

    check-cast v4, Ljava/lang/String;

    invoke-static {v1}, Lz3/۟ۡ۠ۦۣ;->ۨۥۧۦ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    invoke-static {v0}, Lc3/۟ۥ۠ۡۧ;->۠ۨۨ۠(Ljava/lang/Object;)V

    invoke-static {v1}, Lm7/ۡۢۦۢ;->ۦۣۤۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v0, 0xbe7f

    :goto_4
    const v3, 0xbe90

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_3

    goto :goto_4

    :cond_3
    :sswitch_b
    const v0, 0xbebd

    goto :goto_4

    :sswitch_c
    if-eqz v2, :cond_3

    const v0, 0xbedc

    goto :goto_4

    :sswitch_d
    invoke-static {v2, v4}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->ۢ۟ۢۢ(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    const v0, 0xbefb

    :goto_5
    const v3, 0xbf0c

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_4

    goto :goto_5

    :cond_4
    :sswitch_e
    const v0, 0xbf39

    goto :goto_5

    :sswitch_f
    if-nez v2, :cond_4

    const v0, 0xc1e3

    goto :goto_5

    :sswitch_10
    const v0, 0xc202

    :goto_6
    const v1, 0xc213

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_5

    goto :goto_6

    :sswitch_11
    const v0, 0xc221

    goto :goto_6

    :sswitch_12
    iput-object v4, v1, Lk6/p7;->F:Ljava/lang/String;

    iput-object v13, v1, Lk6/p7;->E:Lk6/q6;

    const v0, 0xc27e

    :goto_7
    const v1, 0xc28f

    xor-int/2addr v0, v1

    sparse-switch v0, :sswitch_data_6

    goto :goto_7

    :sswitch_13
    const v0, 0xc29d

    goto :goto_7

    :sswitch_14
    new-instance v5, Lk6/q6;

    check-cast v3, Ljava/lang/String;

    invoke-static {p0}, Lp0/۟ۢۤۧ;->ۨۡۨ۠(Ljava/lang/Object;)J

    move-result-wide v6

    invoke-direct {v5, v3, v2, v6, v7}, Lk6/q6;-><init>(Ljava/lang/String;Ljava/lang/String;J)V

    check-cast v1, Lk6/h5;

    invoke-static {v1}, Lf/ۣ۟ۤۤ;->ۦۣ۠ۥ(Ljava/lang/Object;)Lk6/p7;

    move-result-object v1

    check-cast v4, Ljava/lang/String;

    invoke-static {v1}, Lz3/۟ۡ۠ۦۣ;->ۨۥۧۦ(Ljava/lang/Object;)Lk6/z4;

    move-result-object v0

    invoke-static {v0}, Lc3/۟ۥ۠ۡۧ;->۠ۨۨ۠(Ljava/lang/Object;)V

    invoke-static {v1}, Lm7/ۡۢۦۢ;->ۦۣۤۨ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    const v0, 0xc2fa

    :goto_8
    const v3, 0xc30b

    xor-int/2addr v0, v3

    sparse-switch v0, :sswitch_data_7

    goto :goto_8

    :sswitch_15
    if-eqz v2, :cond_5

    const v0, 0xc5e2

    goto :goto_8

    :cond_5
    :sswitch_16
    const v0, 0xc5c3

    goto :goto_8

    :sswitch_17
    invoke-static {v2, v4}, Landroid/support/v4/graphics/drawable/ۣۣ۟ۤ۠;->ۢ۟ۢۢ(Ljava/lang/Object;Ljava/lang/Object;)Z

    :sswitch_18
    iput-object v4, v1, Lk6/p7;->F:Ljava/lang/String;

    iput-object v5, v1, Lk6/p7;->E:Lk6/q6;

    goto/16 :goto_2

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_7
        0x1f4 -> :sswitch_6
    .end sparse-switch

    :sswitch_data_2
    .sparse-switch
        0x11 -> :sswitch_8
        0xb918 -> :sswitch_14
        0xb939 -> :sswitch_a
        0xb97b -> :sswitch_9
    .end sparse-switch

    :sswitch_data_3
    .sparse-switch
        0xe -> :sswitch_b
        0x2d -> :sswitch_12
        0x4c -> :sswitch_d
        0xef -> :sswitch_c
    .end sparse-switch

    :sswitch_data_4
    .sparse-switch
        0x16 -> :sswitch_e
        0x35 -> :sswitch_12
        0x1f7 -> :sswitch_f
        0x7eef -> :sswitch_10
    .end sparse-switch

    :sswitch_data_5
    .sparse-switch
        0x11 -> :sswitch_11
        0x32 -> :sswitch_7
    .end sparse-switch

    :sswitch_data_6
    .sparse-switch
        0x12 -> :sswitch_7
        0xf1 -> :sswitch_13
    .end sparse-switch

    :sswitch_data_7
    .sparse-switch
        0x1f1 -> :sswitch_15
        0x6af -> :sswitch_16
        0x6c8 -> :sswitch_18
        0x6e9 -> :sswitch_17
    .end sparse-switch
.end method
