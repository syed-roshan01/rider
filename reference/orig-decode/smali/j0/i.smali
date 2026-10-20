.class public final Lj0/i;
.super Lw8/c;


# instance fields
.field public a:Lj0/p;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lj0/p;

.field public d:I


# direct methods
.method public constructor <init>(Lj0/p;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lj0/i;->c:Lj0/p;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lj0/i;->b:Ljava/lang/Object;

    iget p1, p0, Lj0/i;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lj0/i;->d:I

    iget-object p1, p0, Lj0/i;->c:Lj0/p;

    invoke-virtual {p1, p0}, Lj0/p;->a(Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
