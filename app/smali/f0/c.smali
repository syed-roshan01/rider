.class public final Lf0/c;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Ljava/lang/Object;

.field public final d:I

.field public final e:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(JLjava/lang/Object;Lc9/e;II)V
    .locals 3

    iput p6, p0, Lf0/c;->a:I

    iput-wide p1, p0, Lf0/c;->b:J

    iput-object p3, p0, Lf0/c;->e:Ljava/lang/Object;

    iput-object p4, p0, Lf0/c;->c:Ljava/lang/Object;

    iput p5, p0, Lf0/c;->d:I

    sget v0, Lcom/google/firebase/auth/ktx/ۤۡۧ۠;->۟ۤۨۦۧ:I

    xor-int/lit16 v0, v0, 0x31a

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lr/۠ۡ۠;->۟ۡۨۥۤ()I

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
    const-string v0, "OtTqi"

    invoke-static {v0}, Ld9/ۣ۟۠ۢۡ;->۟۟ۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v0

    sget-object v2, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v2, v0, v1}, Ljava/io/PrintStream;->println(J)V

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

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;JI)V
    .locals 3

    sget v0, Lcom/google/firebase/remoteconfiginterop/ۢ۟ۢۦ;->ۧۤۨۦ:I

    xor-int/lit8 v0, v0, -0x19

    iput v0, p0, Lf0/c;->a:I

    iput-object p1, p0, Lf0/c;->e:Ljava/lang/Object;

    iput-object p2, p0, Lf0/c;->c:Ljava/lang/Object;

    iput-wide p3, p0, Lf0/c;->b:J

    iput p5, p0, Lf0/c;->d:I

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lt1/ۧۦۤۧ;->ۣۡ۠ۦ()I

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
    const-string v0, "boPb"

    invoke-static {v0}, Lj5/۟ۢۥۨۦ;->۟ۤۢۢۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 6

    invoke-static {p0}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->۟ۢۡۧۡ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Landroidx/core/content/ۣۣۣ۟;->۟۟ۦ۠ۡ(Ljava/lang/Object;)I

    move-result v4

    invoke-static {p0}, Lr2/ۧۧۢۢ;->ۧ۠ۢۨ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-static {p0}, Ldagger/hilt/android/internal/ۣۧۨۨ;->ۣ۟ۧۧ۟(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    packed-switch v0, :pswitch_data_0

    move-object v0, v2

    check-cast v0, Ljava/lang/String;

    move-object v1, v3

    check-cast v1, Ljava/lang/String;

    invoke-static {p0}, Lcom/google/firebase/analytics/ktxtesting/ۦۣۤ۠;->ۣۧۦۢ(Ljava/lang/Object;)J

    move-result-wide v2

    xor-int/lit8 v5, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    or-int/2addr v4, v5

    invoke-static {v4}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Ln/ۣۣۢۢ;->۟ۦۧۦۢ(Ljava/lang/Object;Ljava/lang/Object;JLjava/lang/Object;I)V

    :goto_0
    return-void

    :pswitch_0
    invoke-static {p0}, Lcom/google/firebase/analytics/ktxtesting/ۦۣۤ۠;->ۣۧۦۢ(Ljava/lang/Object;)J

    move-result-wide v0

    check-cast v2, La2/c0;

    check-cast v3, Lc9/e;

    xor-int/lit8 v5, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    or-int/2addr v4, v5

    invoke-static {v4}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Ldagger/hilt/internal/generatesrootinput/ۣ۟۟ۤۧ;->ۨۡۢۢ(JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    :pswitch_1
    invoke-static {p0}, Lcom/google/firebase/analytics/ktxtesting/ۦۣۤ۠;->ۣۧۦۢ(Ljava/lang/Object;)J

    move-result-wide v0

    check-cast v2, Ly0/o;

    check-cast v3, Lc9/e;

    xor-int/lit8 v5, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    or-int/2addr v4, v5

    invoke-static {v4}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v5

    move-object v4, p1

    invoke-static/range {v0 .. v5}, Lokhttp3/internal/publicsuffix/۟۠ۦۣۢ;->ۧۤۡۢ(JLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Lcom/auto/accept/ui/viewmodel/ۡ۠ۨۥ;->۟ۢۡۧۡ(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lja/ۥۣۨ۠;->ۣ۟۠ۡۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lja/ۥۣۨ۠;->ۣ۟۠ۡۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lja/ۥۣۨ۠;->ۣ۟۠ۡۢ(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
