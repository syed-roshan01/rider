.class public final Lz/f;
.super Ljava/lang/Object;

# interfaces
.implements La0/o;


# instance fields
.field public final a:Lc9/c;

.field public final b:Lc9/c;

.field public final c:Lc9/g;


# direct methods
.method public constructor <init>(Ld5/i1;Lu0/b;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput-object v0, p0, Lz/f;->a:Lc9/c;

    iput-object p1, p0, Lz/f;->b:Lc9/c;

    iput-object p2, p0, Lz/f;->c:Lc9/g;

    return-void
.end method


# virtual methods
.method public final a()Lc9/c;
    .locals 1

    iget-object v0, p0, Lz/f;->b:Lc9/c;

    return-object v0
.end method

.method public final getKey()Lc9/c;
    .locals 1

    iget-object v0, p0, Lz/f;->a:Lc9/c;

    return-object v0
.end method
