.class public final Lg1/b;
.super Ljava/lang/Object;


# instance fields
.field public final a:Lg1/d;

.field public final synthetic b:Lg1/c;


# direct methods
.method public constructor <init>(Lg1/c;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lg1/b;->b:Lg1/c;

    new-instance p1, Lg1/d;

    invoke-direct {p1, p0}, Lg1/d;-><init>(Lg1/b;)V

    iput-object p1, p0, Lg1/b;->a:Lg1/d;

    return-void
.end method


# virtual methods
.method public final a()Le1/p;
    .locals 1

    iget-object v0, p0, Lg1/b;->b:Lg1/c;

    iget-object v0, v0, Lg1/c;->a:Lg1/a;

    iget-object v0, v0, Lg1/a;->c:Le1/p;

    return-object v0
.end method

.method public final b()J
    .locals 2

    iget-object v0, p0, Lg1/b;->b:Lg1/c;

    iget-object v0, v0, Lg1/c;->a:Lg1/a;

    iget-wide v0, v0, Lg1/a;->d:J

    return-wide v0
.end method

.method public final c(J)V
    .locals 1

    iget-object v0, p0, Lg1/b;->b:Lg1/c;

    iget-object v0, v0, Lg1/c;->a:Lg1/a;

    iput-wide p1, v0, Lg1/a;->d:J

    return-void
.end method
