.class public Lr0/d;
.super Lr8/e;

# interfaces
.implements Lp0/f;


# static fields
.field public static final c:Lr0/d;


# instance fields
.field public final a:Lr0/r;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lr0/d;

    sget-object v1, Lr0/r;->e:Lr0/r;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lr0/d;-><init>(Lr0/r;I)V

    sput-object v0, Lr0/d;->c:Lr0/d;

    return-void
.end method

.method public constructor <init>(Lr0/r;I)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lr0/d;->a:Lr0/r;

    iput p2, p0, Lr0/d;->b:I

    return-void
.end method


# virtual methods
.method public a()Lr0/f;
    .locals 1

    new-instance v0, Lr0/f;

    invoke-direct {v0, p0}, Lr0/f;-><init>(Lr0/d;)V

    return-object v0
.end method

.method public final b(Ljava/lang/Object;Ls0/a;)Lr0/d;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, Lr0/d;->a:Lr0/r;

    invoke-virtual {v2, p1, v1, v0, p2}, Lr0/r;->u(Ljava/lang/Object;IILjava/lang/Object;)Lr0/q;

    move-result-object p1

    if-nez p1, :cond_1

    return-object p0

    :cond_1
    new-instance p2, Lr0/d;

    iget-object v0, p1, Lr0/q;->a:Lr0/r;

    iget v1, p0, Lr0/d;->b:I

    iget p1, p1, Lr0/q;->b:I

    add-int/2addr v1, p1

    invoke-direct {p2, v0, v1}, Lr0/d;-><init>(Lr0/r;I)V

    return-object p2
.end method

.method public bridge synthetic builder()Lp0/e;
    .locals 1

    invoke-virtual {p0}, Lr0/d;->a()Lr0/f;

    move-result-object v0

    return-object v0
.end method

.method public containsKey(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, Lr0/d;->a:Lr0/r;

    invoke-virtual {v2, p1, v1, v0}, Lr0/r;->d(Ljava/lang/Object;II)Z

    move-result p1

    return p1
.end method

.method public get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    goto :goto_0

    :cond_0
    move v1, v0

    :goto_0
    iget-object v2, p0, Lr0/d;->a:Lr0/r;

    invoke-virtual {v2, p1, v1, v0}, Lr0/r;->g(Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
