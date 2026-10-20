.class public final Lk0/t;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# static fields
.field public static final b:Lk0/t;

.field public static final c:Lk0/t;

.field public static final d:Lk0/t;

.field public static final e:Lk0/t;

.field public static final f:Lk0/t;

.field public static final n:Lk0/t;

.field public static final o:Lk0/t;


# instance fields
.field public final a:I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 2

    new-instance v0, Lk0/t;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lk0/t;-><init>(I)V

    sput-object v0, Lk0/t;->b:Lk0/t;

    new-instance v0, Lk0/t;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lk0/t;-><init>(I)V

    sput-object v0, Lk0/t;->c:Lk0/t;

    new-instance v0, Lk0/t;

    sget v1, Lcom/google/firebase/iid/ۣۨۥۣ;->۟ۡۥۤۡ:I

    xor-int/lit8 v1, v1, -0x4e

    invoke-direct {v0, v1}, Lk0/t;-><init>(I)V

    sput-object v0, Lk0/t;->d:Lk0/t;

    new-instance v0, Lk0/t;

    sget v1, Lq6/ۣ۟ۢ۟ۤ;->ۡ۠ۢۦ:I

    xor-int/lit16 v1, v1, -0x29e

    invoke-direct {v0, v1}, Lk0/t;-><init>(I)V

    sput-object v0, Lk0/t;->e:Lk0/t;

    new-instance v0, Lk0/t;

    sget v1, Lf0/ۣۦۦ۠;->۟ۤۡۡ۟:I

    xor-int/lit16 v1, v1, -0x326

    invoke-direct {v0, v1}, Lk0/t;-><init>(I)V

    sput-object v0, Lk0/t;->f:Lk0/t;

    new-instance v0, Lk0/t;

    sget v1, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۧۦۨۦ:I

    xor-int/lit16 v1, v1, 0x3b5

    invoke-direct {v0, v1}, Lk0/t;-><init>(I)V

    sput-object v0, Lk0/t;->n:Lk0/t;

    new-instance v0, Lk0/t;

    sget v1, Landroidx/compose/ui/graphics/ۣۤۧۢ;->ۧۥۡ۠:I

    xor-int/lit16 v1, v1, -0xa0

    invoke-direct {v0, v1}, Lk0/t;-><init>(I)V

    sput-object v0, Lk0/t;->o:Lk0/t;

    return-void
.end method

.method public synthetic constructor <init>(I)V
    .locals 2

    iput p1, p0, Lk0/t;->a:I

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lcom/google/android/play/core/integrity/client/۟ۦۥۥ۠;->ۧۧ۠ۡ()I

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "fy3b3X4KJRbgBeQosTv1AAzOo3Yx"

    invoke-static {v0}, Ll8/ۣ۟ۧۢ۠;->ۤۡۤ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->decode(Ljava/lang/String;)Ljava/lang/Long;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final a(Lt/u0;)V
    .locals 5

    const/16 v4, 0x534

    const/high16 v0, 0x43910000    # 290.0f

    invoke-static {v0}, Ld4/۟۠۠۟ۢ;->ۣۤ۟۠(F)Ljava/lang/Float;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v1}, Ld4/۟۠۠۟ۢ;->ۣۤ۟۠(F)Ljava/lang/Float;

    move-result-object v1

    invoke-static {p0}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->۟ۨۧۤ(Ljava/lang/Object;)I

    move-result v2

    sget v3, Ld4/۟۠۠۟ۢ;->ۣ۟ۢۧۧ:I

    xor-int/lit16 v3, v3, 0x148

    packed-switch v2, :pswitch_data_0

    iput v4, p1, Lt/w0;->a:I

    invoke-static {p1, v3, v1}, Ly9/ۨ۠;->۟ۢۧۡ(Ljava/lang/Object;ILjava/lang/Object;)Lt/t0;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/common/internal/ۣۧۧۡ;->۟ۥۣۢۨ()Lt/w;

    move-result-object v2

    iput-object v2, v1, Lt/s0;->b:Lt/a0;

    invoke-static {p1}, Lh7/ۥۥۢ۟;->ۣ۟۟ۨۧ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p1, v1, v0}, Ly9/ۨ۠;->۟ۢۧۡ(Ljava/lang/Object;ILjava/lang/Object;)Lt/t0;

    invoke-static {}, Li/ۣۢۦ۠;->۟۠ۡۥۣ()I

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
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "FFLZPcrioPqcABJ"

    invoke-static {v0}, Lf1/ۥۦ۟ۥ;->۟ۢۢۦۡ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :goto_1
    :sswitch_3
    return-void

    :pswitch_0
    iput v4, p1, Lt/w0;->a:I

    const/4 v2, 0x0

    invoke-static {p1, v2, v1}, Ly9/ۨ۠;->۟ۢۧۡ(Ljava/lang/Object;ILjava/lang/Object;)Lt/t0;

    move-result-object v1

    invoke-static {}, Lcom/google/android/gms/common/internal/ۣۧۧۡ;->۟ۥۣۢۨ()Lt/w;

    move-result-object v2

    iput-object v2, v1, Lt/s0;->b:Lt/a0;

    invoke-static {p1, v3, v0}, Ly9/ۨ۠;->۟ۢۧۡ(Ljava/lang/Object;ILjava/lang/Object;)Lt/t0;

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public final b(Ly1/v;)V
    .locals 3

    invoke-static {p0}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->۟ۨۧۤ(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۨ۟ۦ()[Lj9/f;

    invoke-static {}, Landroidx/compose/ui/graphics/۟ۥۨۧۥ;->ۣ۟ۡ()Ly1/u;

    move-result-object v0

    invoke-static {}, Lcom/google/firebase/remoteconfig/۟ۧۥ۠۠;->۟ۨ۟ۦ()[Lj9/f;

    move-result-object v1

    const/4 v2, 0x5

    aget-object v1, v1, v2

    invoke-static {}, Lk3/۟ۧ۠۠ۦ;->۟۟ۤۤۢ()Ljava/lang/Boolean;

    move-result-object v1

    invoke-static {v0, p1, v1}, Ldagger/hilt/ۣ۟ۧۤ۠;->۟۠ۦ۠ۤ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V

    :pswitch_1
    invoke-static {}, Lf/ۣ۟ۤۤ;->ۦۤۥ۠()I

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
    const-string v0, "18VoRitqyNL"

    invoke-static {v0}, Ll3/ۥۣۤ۟;->۟ۢۧۥ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :goto_1
    :pswitch_2
    :sswitch_3
    return-void

    :pswitch_3
    const/4 v0, 0x0

    invoke-static {p1, v0}, Lcom/google/firebase/firestore/bundle/۟ۡۦۥۧ;->۟ۨ۠ۨ(Ljava/lang/Object;I)V

    goto :goto_1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_3
        :pswitch_1
        :pswitch_0
        :pswitch_0
        :pswitch_1
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->۟ۨۧۤ(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    check-cast p1, Ly1/v;

    invoke-static {p0, p1}, Lm5/ۣۢ۟ۧ;->ۥ۟۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Ly1/v;

    invoke-static {p0, p1}, Lm5/ۣۢ۟ۧ;->ۥ۟۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Lt/u0;

    invoke-static {p0, p1}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->ۣ۟ۤۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_2
    check-cast p1, Lt/u0;

    invoke-static {p0, p1}, Lcom/google/firebase/remoteconfig/interop/۠ۧۤۧ;->ۣ۟ۤۧۧ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_3
    check-cast p1, Ly1/v;

    invoke-static {p0, p1}, Lm5/ۣۢ۟ۧ;->ۥ۟۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_4
    check-cast p1, Ly1/v;

    invoke-static {p0, p1}, Lm5/ۣۢ۟ۧ;->ۥ۟۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :pswitch_5
    check-cast p1, Ly1/v;

    invoke-static {p0, p1}, Lm5/ۣۢ۟ۧ;->ۥ۟۟ۢ(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
