.class public final Ln0/y;
.super Ln0/g0;


# static fields
.field public static final c:Ln0/y;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Ln0/y;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, Ln0/g0;-><init>(III)V

    sput-object v0, Ln0/y;->c:Ln0/y;

    return-void
.end method


# virtual methods
.method public final a(Ln0/h0;Lm0/d;Lm0/q2;Lm0/w;)V
    .locals 0

    iget p1, p3, Lm0/q2;->m:I

    if-nez p1, :cond_0

    invoke-virtual {p3}, Lm0/q2;->z()V

    const/4 p1, 0x0

    iput p1, p3, Lm0/q2;->r:I

    invoke-virtual {p3}, Lm0/q2;->m()I

    move-result p2

    iget p4, p3, Lm0/q2;->g:I

    sub-int/2addr p2, p4

    iput p2, p3, Lm0/q2;->s:I

    iput p1, p3, Lm0/q2;->h:I

    iput p1, p3, Lm0/q2;->i:I

    iput p1, p3, Lm0/q2;->n:I

    return-void

    :cond_0
    const-string p1, "Cannot reset when inserting"

    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lm0/s;->g(Ljava/lang/String;)V

    const/4 p1, 0x0

    throw p1
.end method
