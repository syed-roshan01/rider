.class public final Ld5/r1;
.super Ld9/j;

# interfaces
.implements Lc9/e;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/String;

.field public final c:Ljava/lang/String;

.field public final d:Lc9/a;

.field public final e:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Lc9/a;II)V
    .locals 3

    iput p5, p0, Ld5/r1;->a:I

    iput-object p1, p0, Ld5/r1;->b:Ljava/lang/String;

    iput-object p2, p0, Ld5/r1;->c:Ljava/lang/String;

    iput-object p3, p0, Ld5/r1;->d:Lc9/a;

    iput p4, p0, Ld5/r1;->e:I

    sget v0, Lt2/۟ۦۢۡۧ;->ۣۣ۟ۤۧ:I

    xor-int/lit16 v0, v0, -0x339

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Ld1/۟۟ۥۡۡ;->ۨۤۦ()I

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
    const-string v0, "uTj"

    invoke-static {v0}, Lj4/ۣۧۤ;->۟ۦۧۨۧ(Ljava/lang/String;)Ljava/lang/String;

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


# virtual methods
.method public final a(Lm0/m;I)V
    .locals 5

    invoke-static {p0}, Lg2/ۢۥۥۡ;->۟ۤۡۤۧ(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lg3/۟ۥۣۣۥ;->ۦۢۨۧ(Ljava/lang/Object;)Lc9/a;

    move-result-object v1

    invoke-static {p0}, Lx4/ۣۡۢ۠;->۟ۧۡ۟ۧ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v2

    invoke-static {p0}, Ls8/ۣۡۡ۠;->۟ۢۥۤۡ(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v3

    invoke-static {p0}, Lcom/google/firebase/encoders/config/ۣۧۦ;->ۣۢۨۤ(Ljava/lang/Object;)I

    move-result v4

    packed-switch v0, :pswitch_data_0

    xor-int/lit8 v0, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    or-int/2addr v0, v4

    invoke-static {v0}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v0

    invoke-static {v3, v2, v1, p1, v0}, Lh/ۥۦۡۧ;->ۦۧۧۧ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {}, Lr6/ۥۡۥۥ;->ۣۢۤۥ()I

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
    const-string v0, "DniQe477oQ"

    invoke-static {v0}, Ln8/ۢۡۨۨ;->۟ۤۤۢ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(I)V

    :goto_1
    :sswitch_3
    return-void

    :pswitch_0
    xor-int/lit8 v0, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    or-int/2addr v0, v4

    invoke-static {v0}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v0

    invoke-static {v3, v2, v1, p1, v0}, Lcom/google/firebase/internal/api/۟ۧۧ۠ۢ;->۟ۡۢ۟ۢ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_1
    xor-int/lit8 v0, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    or-int/2addr v0, v4

    invoke-static {v0}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v0

    invoke-static {v3, v2, v1, p1, v0}, Ld1/۟ۡۨۧۢ;->ۥۧۥ۠(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_2
    xor-int/lit8 v0, v4, 0x1

    and-int/lit8 v4, v4, 0x1

    or-int/2addr v0, v4

    invoke-static {v0}, La7/۠ۢۧ;->ۣۣ۟ۡۨ(I)I

    move-result v0

    invoke-static {v3, v2, v1, p1, v0}, Lh6/ۧۧۤ۟;->۟ۡۦۥۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
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
.end method

.method public final bridge synthetic invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    invoke-static {p0}, Lg2/ۢۥۥۡ;->۟ۤۡۤۧ(Ljava/lang/Object;)I

    move-result v1

    packed-switch v1, :pswitch_data_0

    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->ۣ۟۟ۦ۟(Ljava/lang/Object;Ljava/lang/Object;I)V

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->ۣ۟۟ۦ۟(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    :pswitch_1
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->ۣ۟۟ۦ۟(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    :pswitch_2
    check-cast p1, Lm0/m;

    check-cast p2, Ljava/lang/Number;

    invoke-static {p2}, Lu4/۟ۡۢۦۣ;->ۣۥۧۤ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0, p1, v1}, Lcom/google/android/gms/internal/ads_identifier/۟ۤۨۨۡ;->ۣ۟۟ۦ۟(Ljava/lang/Object;Ljava/lang/Object;I)V

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
