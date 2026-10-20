.class public final Lcom/google/gson/internal/bind/f;
.super Lp7/a0;


# static fields
.field public static final b:Lp7/b0;


# instance fields
.field public final a:Lp7/z;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    invoke-static {}, Lcom/google/gson/internal/bind/f;->d()Lp7/b0;

    move-result-object v0

    sput-object v0, Lcom/google/gson/internal/bind/f;->b:Lp7/b0;

    return-void
.end method

.method public constructor <init>()V
    .locals 1

    sget-object v0, Lp7/y;->b:Lp7/v;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lcom/google/gson/internal/bind/f;->a:Lp7/z;

    return-void
.end method

.method public static d()Lp7/b0;
    .locals 2

    new-instance v0, Lcom/google/gson/internal/bind/f;

    invoke-direct {v0}, Lcom/google/gson/internal/bind/f;-><init>()V

    new-instance v1, Lcom/google/gson/internal/bind/NumberTypeAdapter$1;

    invoke-direct {v1, v0}, Lcom/google/gson/internal/bind/NumberTypeAdapter$1;-><init>(Lcom/google/gson/internal/bind/f;)V

    return-object v1
.end method


# virtual methods
.method public final b(Lv7/a;)Ljava/lang/Object;
    .locals 4

    invoke-virtual {p1}, Lv7/a;->k0()I

    move-result v0

    invoke-static {v0}, Lt/k;->e(I)I

    move-result v1

    const/4 v2, 0x5

    if-eq v1, v2, :cond_1

    const/4 v2, 0x6

    if-eq v1, v2, :cond_1

    const/16 v2, 0x8

    if-ne v1, v2, :cond_0

    invoke-virtual {p1}, Lv7/a;->g0()V

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    new-instance v1, Lp7/q;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Expecting number, got: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {v0}, Lu/k1;->e(I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "; at path "

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Lv7/a;->u(Z)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_1
    iget-object v0, p0, Lcom/google/gson/internal/bind/f;->a:Lp7/z;

    invoke-interface {v0, p1}, Lp7/z;->a(Lv7/a;)Ljava/lang/Number;

    move-result-object p1

    :goto_0
    return-object p1
.end method

.method public final c(Lv7/b;Ljava/lang/Object;)V
    .locals 0

    check-cast p2, Ljava/lang/Number;

    invoke-virtual {p1, p2}, Lv7/b;->d0(Ljava/lang/Number;)V

    return-void
.end method
